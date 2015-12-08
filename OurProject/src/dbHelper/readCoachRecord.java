package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Coach;

public class readCoachRecord {
	private Connection connection;
	private ResultSet results;
	
	private Coach c = new Coach();
	private String id;
	
	public readCoachRecord(String dbName, String uname, String pwd, String id){
		
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
		String query = "select * from coach where coachID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.id);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			c.setId(this.results.getString(1));
			c.setfName(this.results.getString("coachFname"));
			c.setlName(this.results.getString("coachLname"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Coach getCoach(){
		return this.c;
	}
}
