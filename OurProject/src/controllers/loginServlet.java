package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import helper.UserHelper;
import pojo.User;
import utilities.PasswordService;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HttpSession session;
	private String url;
	private int loginAttempts;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		
		if(loginAttempts>2)
		{
			String errorMessage = "Error: NUmber of attempts Exceeded";
			request.setAttribute("errorMessage", errorMessage);
			url = "index.jsp";
		} else {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		
			PasswordService pws = new PasswordService();
			String encryptedPass = pws.encrypt(password);
			
			UserHelper uh = new UserHelper();
			User user = uh.authenticateUser(username, encryptedPass);

			if(user != null)
			{
				session.invalidate();
				session=request.getSession(true);
				session.setAttribute("user", user);
				url = "internalHomepage.jsp";
			} else {
				String errorMessage = "Error: Could not recognize Username or Password";
				session.setAttribute("loginAttempts", loginAttempts++);
				url = "login.jsp";
			}
			
			
			
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		   dispatcher.forward(request, response);
	}

}
