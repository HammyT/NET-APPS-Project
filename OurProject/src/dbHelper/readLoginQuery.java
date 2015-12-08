package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.User;




public class readLoginQuery {
	
	private Connection connection;
	private ResultSet results;
	private String uName ="";
	private String upw = "";
	
	
	public readLoginQuery(String dbname, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/"+ dbname;
		
		uName = uname;
		upw = pwd;
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, "root", "General1");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "select userName, pwd from user";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkTrue(){
		boolean y = false;
		try {
			while(this.results.next()){
				User u = new User("","");
				u.setUsername(this.results.getString("userName"));
				u.setPassword(this.results.getString("pwd"));
				
				if(uName.equals(u.getUsername()) && upw.equals(u.getPassword()))
				{
					y=true;
				}
				else
				{
					y=false;
				}
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return y;
	}
	
	
	

}
