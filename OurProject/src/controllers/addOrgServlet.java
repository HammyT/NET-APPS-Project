package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.addOrgQuery;
import model.Organization;

/**
 * Servlet implementation class addOrgServlet
 */
@WebServlet("/addOrg")
public class addOrgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addOrgServlet() {
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
		// TODO Auto-generated method stub
		  String name = request.getParameter("name");
	      int number = Integer.parseInt(request.getParameter("number"));  
			 String address = request.getParameter("address");
			 String city = request.getParameter("city");
			 String state = request.getParameter("state");
		    String region = request.getParameter("region"); 
		    int zip = Integer.parseInt(request.getParameter("zip"));
		

		    Organization org = new Organization();
		    org.setName(name);
			org.setNumber(number);
			org.setAddress(address);
			org.setCity(city);
			org.setState(state);
			org.setRegion(region);
			org.setZip(zip);
			
			
		    addOrgQuery aq = new addOrgQuery("project", "root", "");
		    

		    aq.doAdd(org);
		    
	
		    String url = "/readOrg";
		    
		    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		    dispatcher.forward(request, response);
		    
	}

}
