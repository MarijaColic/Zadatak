package engineering.web.servlet;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import engineering.web.model.CityRepository;
@WebServlet("/city")
public class CityManagemenServlet extends HttpServlet{
	
	

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		String option = req.getParameter("option");
		
		List<CityRepository> cities = (List<CityRepository>) req.getServletContext().getAttribute("cities");
		switch (option) {
		case "Dodaj grad":
			req.setAttribute("unos", "Unesite podatke o gradu");
			req.getRequestDispatcher("/addcity.jsp").forward(req, resp);
			break;
		
		case "Prikazi sve gradove":
			req.setAttribute("list", cities);
			req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
			break;
	
		case "Izmeni naziv grada":
			req.getRequestDispatcher("/updatecity.jsp").forward(req, resp);
			break;
		
		case "Prikaz podataka o gradu":
			String naziv = req.getParameter("naziv");
			for(CityRepository c : cities) {
				if(c.getNaziv().equals(naziv)){
					req.setAttribute("city", "PTTBroj grada je : " + c.getPTTB() + " , Naziv grada je : " + c.getNaziv());
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
					}
			
				else {
					req.setAttribute("errorCity", "Ne postoji takav grad u bazi");
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
				}
			}
			break;
		
		case "Brisanje grada":

			break;
		}
		
		
	};
	
	protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		String option = req.getParameter("option");
		List<CityRepository> cities = (List<CityRepository>) req.getServletContext().getAttribute("cities");
		switch (option) {
		case "Dodaj":
			String pttb = req.getParameter("pttb");
			String naziv = req.getParameter("naziv");
			
			for(CityRepository c : cities) {
				if(!String.valueOf(c.getPTTB()).equals(pttb)) {
					cities.add(new CityRepository(Long.parseLong(pttb), naziv));
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
				}else {
					req.setAttribute("errorAdd", "Grad vec postoji u bazi ..");
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
				}
			}
			break;
		case "Izmeni":
			String stariNaziv = req.getParameter("naziv1");
			String noviNaziv = req.getParameter("naziv2");

			for(CityRepository c : cities) {
				if(stariNaziv.equals(c.getNaziv())) {
					c.setNaziv(noviNaziv);
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
				}else {
					req.setAttribute("errorAdd", "Grad ne postoji u bazi ..");
					req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
				}
			}
			break;
		}
			
		
	};
}
