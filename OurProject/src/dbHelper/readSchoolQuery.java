package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.School;

public class readSchoolQuery {
	private Connection connection;
	private ResultSet results;
	
	public readSchoolQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "select * from school";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table ="";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				School s = new School();
				s.setId(this.results.getString("schoolID"));
				s.setName(this.results.getString("name"));
				s.setAddress(this.results.getString("address"));
				s.setNumber(this.results.getInt("schoolNumber"));
				s.setState(this.results.getString("schoolState"));
				s.setZip(this.results.getString("schoolZip"));
				s.setRegion(this.results.getString("schoolRegion"));
				s.setAdmissionUrl(this.results.getString("admissionURL"));
				s.setFinancialUrl(this.results.getString("financialURL"));
				s.setApplicationUrl(this.results.getString("applicationURL"));
				s.setPriceUrl(this.results.getString("netPriceURL"));
				s.setEmail(this.results.getString("schoolEmail"));
				s.setCountry(this.results.getString("schoolCountry"));
				
				table +="<tr>";
				table +="<td>";
				table += s.getId();
				table +="</td>";
				table +="<td>";
				table += s.getName();
				table +="</td>";
				table +="<td>";
				table += s.getAddress();
				table +="</td>";
				table +="<td>";
				table += s.getNumber();
				table +="</td>";
				table +="<td>";
				table += s.getState();
				table +="</td>";
				table +="<td>";
				table += s.getZip();
				table +="</td>";
				table +="<td>";
				table += s.getRegion();
				table +="</td>";
				table +="<td>";	
				table +="<td>";
				table += s.getCountry();
				table +="</td>";
				table += s.getAdmissionUrl();
				table +="</td>";
				table +="<td>";
				table += s.getFinancialUrl();
				table +="</td>";
				table +="<td>";
				table += s.getApplicationUrl();
				table +="</td>";
				table +="<td>";
				table += s.getEmail();
				table +="</td>";
			
				table +="<td>";
				   table += "<a href=usdateSchoolForm?name=" + s.getId() + " >usdate</a> <a href=deleteSchool?name=" + s.getId() + " >delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}

}
