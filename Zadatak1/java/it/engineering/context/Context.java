package it.engineering.context;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import it.engineering.model.UserRepository;

@WebListener
public class Context implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		List<UserRepository> users = new ArrayList<UserRepository>();
		users.add(new UserRepository("marija", "colic", "colic@gmail.com", "123"));
		sce.getServletContext().setAttribute("users", users);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
