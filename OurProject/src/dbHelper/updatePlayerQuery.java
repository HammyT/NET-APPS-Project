package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Player;

public class updatePlayerQuery {
	private Connection connection;
	
	public updatePlayerQuery(String dbName, String uname, String pwd){
		
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
	
	public void doUpdate(Player p){
		String query = "update player set playerFname=?, playerLname=?, playerAge=?, playerGender=? where playerID=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
		
			ps.setString(1, p.getfName());
			ps.setString(2, p.getlName());
			ps.setString(4, p.getGender());
			ps.setInt(3, p.getAge());
		    ps.setString(5, p.getId());
		    
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
