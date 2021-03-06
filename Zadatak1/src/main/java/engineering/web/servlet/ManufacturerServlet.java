package engineering.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import engineering.web.model.CityRepository;
import engineering.web.model.ManufacurerRepository;
@WebServlet("/man")
public class ManufacturerServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String option = req.getParameter("option");
		
		List<ManufacurerRepository> manlist = (List<ManufacurerRepository>) req.getServletContext().getAttribute("manlist");
		switch (option) {
		case "Dodaj proizvodjaca":
			req.setAttribute("message", "Unesi podatke o proizvodjacu");
			req.getRequestDispatcher("/manufacturer/addmanpage.jsp").forward(req, resp);
			break;
		case "Prikazi sve proizvodjace":
			req.setAttribute("list", manlist);
			req.getRequestDispatcher("/manufacturer/viewman.jsp").forward(req, resp);
			break;

		case "Izmeni podatke o proizvodjacu":
	
			break;

		case "Prikaz podataka o proizvodjacu":
	
			break;

		case "Obrisi proizvodjaca":
			
			break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String option = req.getParameter("option");
		
		List<ManufacurerRepository> manlist = (List<ManufacurerRepository>) req.getServletContext().getAttribute("manlist");
		switch (option) {
		case "Dodaj":
			String pib = req.getParameter("PIB");
			String jmbg = req.getParameter("JMBG");
			String naziv = req.getParameter("naziv");
			String adresa = req.getParameter("adresa");
			String grad = req.getParameter("grad");
			
			for(ManufacurerRepository man  : manlist) {
				if(!String.valueOf(man.getPIB()).equals(pib)) {
					if(grad.equals(man.getCity().getNaziv())) {
					manlist.add(new ManufacurerRepository(Integer.parseInt(pib),jmbg,naziv,adresa, new CityRepository(man.getCity().getPTTB(), grad)));
					req.getRequestDispatcher("/manufacturer/manufacturerpage.jsp").forward(req, resp);
					}else {
						req.setAttribute("errAdd", "Ne postoji takav grad u bazi");
						req.getRequestDispatcher("/manufacturer/manufacturerpage.jsp").forward(req, resp);
					}
					}else {
					req.setAttribute("errorAdd", "Proizvodjac vec postoji u bazi");
					req.getRequestDispatcher("/manufacturer/manufacturerpage.jsp").forward(req, resp);
				}
				}
			break;
		}
	}
}
