package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.readPlayerByTeamQuery;
/**
 * Servlet implementation class readPlayerByTeamServlet
 */
@WebServlet("/readPlayerByTeam")
public class readPlayerByTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readPlayerByTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a ReadQuery helper object
		readPlayerByTeamQuery rq = new readPlayerByTeamQuery("project", "root", "General1");
		String id = request.getParameter("id");
		// Get the html table from the REadQuery object
		rq.doRead(id);
		String table = rq.getHTMLTable();
		
		// pass execution control to read.jsp along with the table
		request.setAttribute("table", table);
		String url = "/player.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
