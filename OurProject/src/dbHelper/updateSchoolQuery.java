package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.School;



public class updateSchoolQuery {
	private Connection connection;
	
	public updateSchoolQuery(String dbName, String uname, String pwd){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doUpdate(School s){
		String query = "update school set schoolName=?, schoolNumber=?, schoolAddress=?, schoolCity=?, schoolState=?, schoolZip=?, schoolRegion=?, schoolCountry=?, admissionURL=?, financialaidURL=?, applicationURL=?, netPriceURL=?, schoolEmail=? where schoolID=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
		
			ps.setString(1, s.getName());
			ps.setInt(2, s.getNumber());
			ps.setString(3, s.getAddress());
			ps.setString(4, s.getCity());
			ps.setString(5, s.getState());
			ps.setInt(6, s.getZip());
		    ps.setString(7, s.getRegion());
		    ps.setString(8, s.getCountry());
		    ps.setString(9, s.getAdmissionUrl());
		    ps.setString(10, s.getFinancialUrl());
		    ps.setString(11, s.getApplicationUrl());
		    ps.setString(12, s.getPriceUrl());
		    ps.setString(13, s.getEmail());
		    ps.setString(14, s.getId());
		    
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
