package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Coach;

public class updateCoachQuery {
	private Connection connection;
	
	public updateCoachQuery(String dbName, String uname, String pwd){
		
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
	
	public void doUpdate(Coach c){
		String query = "update coach set coachFname=?, coachLname=? where coachID=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
		
			ps.setString(3, c.getId());
			ps.setString(1, c.getfName());
			ps.setString(2, c.getlName());
		    
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
