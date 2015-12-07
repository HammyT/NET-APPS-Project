package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		String query = "select * from  where orgName = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.id);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			org.setName(this.results.getString(1));
			org.setNumber(this.results.getInt("orgNumber"));
			org.setAddress(this.results.getString("orgAddress"));
			org.setCity(this.results.getString("orgCity"));
			org.setState(this.results.getString("orgState"));
			org.setRegion(this.results.getString("orgRegion"));
			org.setZip(this.results.getInt("orgZip"));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Organization getOrg(){
		return this.org;
	}
}
