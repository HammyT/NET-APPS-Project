package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.searchLocationQuery;
import dbHelper.searchSportQuery;
import dbHelper.searchTeamQuery;


/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
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
		
		String type = request.getParameter("searchType");
		String keyword = request.getParameter("searchR");
		String url;
		
		if(type.equals("Sport")){
			searchSportQuery sq = new searchSportQuery("project", "root", "General1");
			url = "/sportList.jsp";

			sq.doRead(keyword);
			String table = sq.getHTMLTable();
			
			// pass execution control to read.jsp along with the table
			request.setAttribute("table", table);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		if(type.equals("Team Name")){
			searchTeamQuery sq = new searchTeamQuery("project", "root", "General1");
			url = "/team.jsp";

			sq.doRead(keyword);
			String table = sq.getHTMLTable();
			
	
			request.setAttribute("table", table);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		if(type.equals("State")){
			searchLocationQuery sq = new searchLocationQuery("project", "root", "General1");
			url = "/location.jsp";

			sq.doRead(keyword);
			String table = sq.getHTMLTable();
			
			request.setAttribute("table", table);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		
		
	}
}
