package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.readOrgQuery;
import dbHelper.updateOrgQuery;
import model.Organization;

/**
 * Servlet implementation class updateOrgServlet
 */
@WebServlet("/updateOrg")
public class updateOrgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateOrgServlet() {
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
			
			updateOrgQuery uq = new updateOrgQuery("project", "root", "General1");
			uq.doUpdate(org);

			
		readOrgQuery rq = new readOrgQuery("project", "root", "General1");
		
		rq.doRead(name);
		String table =  rq.getHTMLTable();
		
		request.setAttribute("table", table);
	
		String url = "/organization.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
