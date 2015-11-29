/**
 * 
 */
package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Organization;

/**
 * @author craigpiercy
 *
 */
public class readOrgRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Organization org = new Organization();
	private String name;
	
	public readOrgRecord(String dbName, String uname, String pwd, String name){
		
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
		String query = "select * from org where orgName = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.name);
			
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
