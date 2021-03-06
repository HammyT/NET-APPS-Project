package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Sport;


public class readSportRecord {
	private Connection connection;
	private ResultSet results;
	
	private Sport s = new Sport();
	private String name;
	
	public readSportRecord(String dbName, String uname, String pwd, String name){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.name = name;
		
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
		String query = "select * from sport where sportName = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.name);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			s.setName(this.results.getString(1));
			s.setDescription(this.results.getString("sportDescription"));


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Sport getSport(){
		return this.s;
	}
}
