package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelper.updateSchoolQuery;
import model.School;

/**
 * Servlet implementation class updateSchoolServlet
 */
@WebServlet("/updateSchoolServlet")
public class updateSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateSchoolServlet() {
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
	      int number = Integer.parseInt(request.getParameter("number"));  
			 String address = request.getParameter("address");
			 String city = request.getParameter("city");
			 String state = request.getParameter("state");
			int zip = Integer.parseInt(request.getParameter("zip"));
		    String region = request.getParameter("region"); 
		    String country = request.getParameter("country"); 
		    String admissionUrl = request.getParameter("admissionUrl");
		    String financialUrl = request.getParameter("financialUrl");
		    String applicationUrl = request.getParameter("applicationUrl");
		    String priceUrl = request.getParameter("priceUrl");
		    String email = request.getParameter("eamil");
		
	
		    School s = new School();
		    s.setId(id);
		    s.setName(name);
		    s.setNumber(number);
		    s.setAddress(address);
		    s.setState(state);
		    s.setCity(city);
		    s.setZip(zip);
		    s.setRegion(region);
		    s.setCountry(country);
		    s.setAdmissionUrl(admissionUrl);
		    s.setFinancialUrl(financialUrl);
		    s.setApplicationUrl(applicationUrl);
		    s.setPriceUrl(priceUrl);
		    s.setEmail(email);
		

		updateSchoolQuery uq = new updateSchoolQuery("grocery", "root", "");
		uq.doUpdate(s);
		
	
		String url = "/readSchool";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
