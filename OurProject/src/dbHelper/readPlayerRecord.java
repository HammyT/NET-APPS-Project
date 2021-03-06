package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Player;

public class readPlayerRecord {
	private Connection connection;
	private ResultSet results;
	
	private Player p = new Player();
	private String id;
	
	public readPlayerRecord(String dbName, String uname, String pwd, String id){
		
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
		String query = "select * from player where playerID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.id);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			p.setId(this.results.getString(1));
			p.setfName(this.results.getString("playerFname"));
			p.setlName(this.results.getString("playerLname"));
			p.setAge(this.results.getInt("playerAge"));
			p.setGender(this.results.getString("playerGender"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Player getPlayer(){
		return this.p;
	}
}
