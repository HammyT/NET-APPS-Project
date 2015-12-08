package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Team;


public class searchTeamQuery {
	private Connection connection;
	private ResultSet results;
	
	public searchTeamQuery(String dbName, String uname, String pwd){
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
	
	public void doRead(String keyword){
		String query = "SELECT * FROM team WHERE teamName LIKE '%" + keyword + "%'";
		
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
				Team t = new Team();
				t.setId(this.results.getString("teamID"));
				t.setName(this.results.getString("teamName"));
				t.setCoach(this.results.getString("headcoach"));
				t.setLevel(this.results.getString("level"));
				t.setDivision(this.results.getString("division"));

				
				table +="<tr>";
				table +="<td>";
				table += "<a href=browseServlet?id=" + t.getId() +">" + t.getId() + "</a>";
				table +="</td>";
				table +="<td>";
				table += t.getName();
				table +="</td>";
				table +="<td>";
				table += t.getCoach();
				table +="</td>";
				table +="<td>";
				table += t.getLevel();
				table +="</td>";
				table +="<td>";
				table += t.getDivision();
				table +="</td>";
				table +="<td>";
				   table += "<a href=updateTeamForm?id=" + t.getId() + " >update</a> <a href=deleteTeam?id=" + t.getId() + " >delete</a>";
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
