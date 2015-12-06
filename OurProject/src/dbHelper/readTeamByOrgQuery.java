package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Team;

public class readTeamByOrgQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public readTeamByOrgQuery(String dbName, String uname, String pwd){
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
		String query = "SELECT teamName, headcoach, level, division FROM project.org, project.team where org.orgName = project.team.orgName";
		
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
				t.setName(this.results.getString("teamName"));
				t.setCoach(this.results.getString("headcoach"));
				t.setLevel(this.results.getString("level"));
				t.setDivision(this.results.getString("division"));

				
				table +="<tr>";
				table +="<td>";
				table += "<a href= readPlayer>" + t.getName() + "</a>";
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
				   table += "<a href=updateTeamForm?name=" + t.getId() + " >update</a> <a href=deleteTeam?name=" + t.getId() + " >delete</a>";
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
