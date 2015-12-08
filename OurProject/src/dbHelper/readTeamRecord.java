package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Team;


public class readTeamRecord {
	private Connection connection;
	private ResultSet results;
	
	private Team t = new Team();
	private String id;
	
	public readTeamRecord(String dbName, String uname, String pwd, String id){
		
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
		String query = "select teamID, teamName, headcoach, level, division from team where teamID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.id);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			t.setId(this.results.getString(1));
			t.setName(this.results.getString("teamName"));
			t.setCoach(this.results.getString("headcoach"));
			t.setLevel(this.results.getString("level"));
			t.setDivision(this.results.getString("division"));


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Team getTeam(){
		return this.t;
	}
}
