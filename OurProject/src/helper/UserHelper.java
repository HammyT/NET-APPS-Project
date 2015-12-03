package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.User;
import com.mysql.jdbc.PreparedStatement;

public class UserHelper {

	
	private java.sql.PreparedStatement authenticateUserStatement;
	
	public UserHelper()
	{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql//127.0.0.1:3306/sportchirp", "root", "");
		
		authenticateUserStatement= conn.prepareStatement("select * from user where userName=? and pwd=?");
		
	} catch(Exception e)
	{
		System.out.println(e.getClass().getName() + ": " + e.getMessage());
	}
		
	}
	
	public User authenticateUser(String username, String password)
	{
		User user = null;
		try {
			authenticateUserStatement.setString(1, username);
			// hash the clear passward
			// add the hash version to the query
			authenticateUserStatement.setString(2, password);
			
			
			ResultSet rs = authenticateUserStatement.executeQuery();
			
			if(rs.next())
			{
				user = new User (rs.getInt("userID"), rs.getString("username"), rs.getString("password"));
			}
			} catch (SQLException e)
		{
				System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return user;
	}
	
	
	
}
