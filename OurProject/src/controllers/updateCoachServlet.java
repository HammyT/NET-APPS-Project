package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.readCoachQuery;
import dbHelper.updateCoachQuery;
import model.Coach;

/**
 * Servlet implementation class updateCoachServlet
 */
@WebServlet("/updateCoach")
public class updateCoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateCoachServlet() {
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
		  String id = request.getParameter("id"); 
			String fName = request.getParameter("fName");
			 String lName = request.getParameter("lName");
		
	
		    Coach c = new Coach();
		    c.setId(id);
		    c.setfName(fName);
			c.setlName(lName);
	
		

		updateCoachQuery uq = new updateCoachQuery("grocery", "root", "General1");
		uq.doUpdate(c);
		
      readCoachQuery rq = new readCoachQuery("project", "root", "General1");
		
		rq.doRead(id);
		String table =  rq.getHTMLTable();
		
		request.setAttribute("table", table);
	
		String url = "/coach.jsp";
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
