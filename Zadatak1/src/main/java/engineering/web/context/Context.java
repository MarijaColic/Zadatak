package engineering.web.context;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import engineering.web.model.UserRepository;
@WebListener
public class Context implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		List<UserRepository> users = new ArrayList<>();
		users.add(new UserRepository("Marija", "Colic", "colic@gm.com", "123"));
		sce.getServletContext().setAttribute("users", users);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
