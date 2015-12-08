package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.readPlayerQuery;
import dbHelper.updatePlayerQuery;
import model.Player;

/**
 * Servlet implementation class updatePlayerServlet
 */
@WebServlet("/updatePlayer")
public class updatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatePlayerServlet() {
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
			 String gender = request.getParameter("gender");
		    int age = Integer.parseInt(request.getParameter("age"));
		
	
		  Player p = new Player();
		    p.setId(id);
			p.setfName(fName);
			p.setlName(lName);
			p.setGender(gender);
			p.setAge(age);
		

		updatePlayerQuery uq = new updatePlayerQuery("project", "root", "General1");
		uq.doUpdate(p);
		
       readPlayerQuery rq = new readPlayerQuery("project", "root", "General1");
		
		rq.doRead(id);
		String table =  rq.getHTMLTable();
		
		request.setAttribute("table", table);
	
		String url = "/player.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
