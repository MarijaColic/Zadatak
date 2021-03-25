package engineering.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import engineering.web.model.UserRepository;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("username");
		String password = req.getParameter("password");
		
		List<UserRepository> users = (List<UserRepository>) getServletContext().getAttribute("users");
		for(UserRepository u : users) {
			if(u.getEmail().equals(email) && u.getSifra().equals(password)) {
				req.setAttribute("user", new UserRepository(u.getIme(),u.getPrezime(),"",""));
				req.getRequestDispatcher("/mainpage.jsp").forward(req, resp);
			}
			else {
				req.setAttribute("message", "Pogresni kredencijali, probajte opet..");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		String selection = req.getParameter("operation");
		
		switch (selection) {
		case "City":
			req.getRequestDispatcher("/citypage.jsp").forward(req, resp);
			break;
		case "Manufacturer":
			req.getRequestDispatcher("/manufacturerpage.jsp").forward(req, resp);
			break;
		case "Product":
			req.getRequestDispatcher("/productpage.jsp").forward(req, resp);
			break;
		case "Logout":
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
			break;
		
		}
	};
	
}
