package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.updateTeamQuery;
import model.Team;

/**
 * Servlet implementation class updateTeamServlet
 */
@WebServlet("/updateTeamServlet")
public class updateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateTeamServlet() {
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
			String name = request.getParameter("name");
			 String coach = request.getParameter("coach");
			 String level = request.getParameter("level");
			 String division = request.getParameter("division");
		
	
		    Team t = new Team();
		    t.setId(id);
		    t.setName(name);
		    t.setCoach(coach);
		    t.setLevel(level);
		    t.setDivision(division);
		    

		updateTeamQuery uq = new updateTeamQuery("grocery", "root", "");
		uq.doUpdate(t);
		
	
		String url = "/readOrg";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
