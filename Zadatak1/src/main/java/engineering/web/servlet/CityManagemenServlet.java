package engineering.web.servlet;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import engineering.web.model.CityRepository;
@WebServlet("/city")
public class CityManagemenServlet extends HttpServlet{

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		String option = req.getParameter("option");
		List<CityRepository> cities = (List<CityRepository>) getServletContext().getAttribute("cities");
		switch (option) {
		case "Dodaj grad":
			
			break;
		
		case "Prikazi sve gradove":
			req.setAttribute("list", cities);
			req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
			break;
	
		case "Izmeni naziv grada":
	
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
}
