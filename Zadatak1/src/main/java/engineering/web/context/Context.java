package engineering.web.context;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import engineering.web.model.CityRepository;
import engineering.web.model.ManufacurerRepository;
import engineering.web.model.UserRepository;
@WebListener
public class Context implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		CityRepository beograd = new CityRepository(11000, "Beograd");
		
		List<UserRepository> users = new ArrayList<>();
		users.add(new UserRepository("Marija", "Colic", "colic@gm.com", "123",beograd));
		sce.getServletContext().setAttribute("users", users);
		
		
		List<CityRepository> cities = new ArrayList<>();
		cities.add(beograd);
		sce.getServletContext().setAttribute("cities", cities);
		
		List<ManufacurerRepository> manlist = new ArrayList<>();
		manlist.add(new ManufacurerRepository(152, "01020666352","Naziv", "Adresa1", beograd));
		sce.getServletContext().setAttribute("manlist", manlist);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
