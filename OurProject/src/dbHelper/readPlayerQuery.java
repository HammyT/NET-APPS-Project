package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Player;

public class readPlayerQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public readPlayerQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
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
		String query = "select * from player";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table ="";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				Player p = new Player();
				p.setId(this.results.getString("playerID"));
				p.setfName(this.results.getString("playerFname"));
				p.setlName(this.results.getString("playerLname"));
				p.setAge(this.results.getInt("playerAge"));
				p.setGender(this.results.getString("playerGender"));
				
				table +="<tr>";
				table +="<td>";
				table += p.getId();
				table +="</td>";
				table +="<td>";
				table += p.getfName();
				table +="</td>";
				table +="<td>";
				table += p.getlName();
				table +="</td>";
				table +="<td>";
				table += p.getAge();
				table +="</td>";
				table +="<td>";
				table += p.getGender();
				table +="</td>";
				table +="<td>";
				   table += "<a href=updatePlayerForm?id=" + p.getId() + " >update</a> <a href=deletePlayer?id=" + p.getId() + " >delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
}
