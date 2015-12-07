package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;

public class updateTeamQuery {
	
	private Connection connection;
	
	public updateTeamQuery(String dbName, String uname, String pwd){
		
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
	
	public void doUpdate(Team t){
		String query = "update team set teamName=?, headcoach=?, level=?, division=? where teamID=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
		
			ps.setString(1, t.getName());
			ps.setString(2, t.getCoach());
			ps.setString(3, t.getLevel());
			ps.setString(4, t.getDivision());
			ps.setString(5, t.getId());
			
		    
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
