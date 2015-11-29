/**
 * 
 */
package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Organization;

/**
 * @author craigpiercy
 *
 */
public class updateOrgQuery {
	
	private Connection connection;
	
	public updateOrgQuery(String dbName, String uname, String pwd){
		
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
	
	public void doUpdate(Organization org){
		String query = "update org set orgNumber=?, orgAddress=?, orgCity=?, orgState=?, orgZip=? where orgName=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
		
			ps.setInt(1, org.getNumber());
			ps.setString(2, org.getAddress());
			ps.setString(3, org.getCity());
			ps.setString(4, org.getState());
			ps.setInt(5, org.getZip());
		    ps.setString(6, org.getName());
		    
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
