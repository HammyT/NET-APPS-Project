package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Organization;

public class readOrgBySportQuery {
	private Connection connection;
	private ResultSet results;
	
	public readOrgBySportQuery(String dbName, String uname, String pwd){
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
	
	public void doRead(String name){
		String query = "SELECT org.orgName, orgNumber, orgAddress, orgCity, orgState, orgZip, orgRegion FROM org, team WHERE  org.orgName = team.orgName AND team.sportName LIKE '" + name + "'";
		
		
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
				Organization org = new Organization();
				org.setName(this.results.getString("orgName"));
				org.setNumber(this.results.getInt("orgNumber"));
				org.setAddress(this.results.getString("orgAddress"));
				org.setCity(this.results.getString("orgCity"));
				org.setState(this.results.getString("orgState"));
				org.setRegion(this.results.getString("orgRegion"));
				org.setZip(this.results.getInt("orgZip"));
				
				table +="<tr>";
				table +="<td>";
				table += "<a href=readTeamByOrg?name=" + org.getName() + ">"+ org.getName() +"</a>";
				table +="</td>";
				table +="<td>";
				table += org.getAddress();
				table +="</td>";
				table +="<td>";
				table += org.getCity();
				table +="</td>";
				table +="<td>";
				table += org.getState();
				table +="</td>";
				table +="<td>";
				table += org.getRegion();
				table +="</td>";
				table +="<td>";
				table += org.getZip();
				table +="</td>";
				table +="<td>";
				table += org.getNumber();
				table +="</td>";
				table +="<td>";
				   table += "<a href=updateOrgForm?name=" + org.getName() + ">update</a> <a href=deleteOrg?name=" + org.getName() + " >delete</a>";
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
