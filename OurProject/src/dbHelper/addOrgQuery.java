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
public class addOrgQuery {
	
	public Connection connection;
	
	public addOrgQuery(String dbName, String uname, String pwd){
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
	
	public void doAdd(Organization org){
		String query = "insert into org (orgName, orgNumber, orgAddress, orgCity, orgState, orgRegion, orgZip) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, org.getName());
			ps.setInt(2, org.getNumber());
			ps.setString(3, org.getAddress());
			ps.setString(4, org.getCity());
			ps.setString(5, org.getState());
			ps.setInt(6, org.getZip());
		
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
