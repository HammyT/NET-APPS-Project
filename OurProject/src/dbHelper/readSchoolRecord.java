package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.School;


public class readSchoolRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private School s = new School();
	private String id;
	
	public readSchoolRecord(String dbName, String uname, String pwd, String id){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.id = id;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead(){
		String query = "select * from school where schoolID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.id);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			s.setId(this.results.getString(1));
			s.setName(this.results.getString("schoolName"));
			s.setAddress(this.results.getString("schoolAddress"));
			s.setNumber(this.results.getInt("schoolNumber"));
			s.setCity(this.results.getString("schoolCity"));
			s.setState(this.results.getString("schoolState"));
			s.setZip(this.results.getInt("schoolZip"));
			s.setRegion(this.results.getString("schoolRegion"));
			s.setAdmissionUrl(this.results.getString("admissionURL"));
			s.setFinancialUrl(this.results.getString("financialaidURL"));
			s.setApplicationUrl(this.results.getString("applicationURL"));
			s.setPriceUrl(this.results.getString("netPriceURL"));
			s.setEmail(this.results.getString("schoolEmail"));
			s.setCountry(this.results.getString("schoolCountry"));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public School getSchool(){
		return this.s;
	}
}
