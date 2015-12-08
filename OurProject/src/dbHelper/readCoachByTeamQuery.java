package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Coach;

public class readCoachByTeamQuery {
	private Connection connection;
	private ResultSet results;
	
	public readCoachByTeamQuery(String dbName, String uname, String pwd){
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
	
	public void doRead(String id){
		String query = "Select coach.coachID,coachFname,coachLname,team.teamID,teamName,headcoach,level,division FROM coach, team, coachroster where coach.coachID = coachroster.coachID and team.teamID = coachroster.teamID and team.teamID like '" + id + "'";
		
		
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
				Coach c = new Coach();
				c.setId(this.results.getString("coachID"));
				c.setfName(this.results.getString("coachFname"));
				c.setlName(this.results.getString("coachLname"));

				
				table +="<tr>";
				table +="<td>";
				table += c.getId();
				table +="</td>";
				table +="<td>";
				table += c.getfName();
				table +="</td>";
				table +="<td>";
				table += c.getlName();
				table +="</td>";
				table +="<td>";
				   table += "<a href=updateCoachForm?id=" + c.getId() + " >update</a> <a href=deleteCoach?id=" + c.getId() + " >delete</a>";
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
