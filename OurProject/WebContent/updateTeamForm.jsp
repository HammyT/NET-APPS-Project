<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Team" %>       
<% Team t = (Team) request.getAttribute("team"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update a Team</title>
<style>
body { background-image: url("sports.jpg");}
a {color: black;}
td {background-color: brown;}
table, td, tr {boarder: 2px solid black;}
table {width: 100%; border-collapse: collapse;}
h1 {text-align: center}
</style>
</head>
<body>
	<table>
		<tr><td>
<h1> Sport Chirp - Update a Team</h1>
</td></tr>
<form name=updateForm action=updateTeam method=get >

   <tr><td>
      <label>
      Team ID:
   </label>
   <input type=text name=id value="<%= t.getId() %>" />
  </td></tr>
	<tr><td>
    <label>
      Team Name:
   </label>
   <input type=text name=name value="<%= t.getName() %>" />
 	</td></tr>
<tr><td>
   <label>
      Team Head Coach:
   </label>
   <input type=text name=coach value="<%= t.getCoach() %>" />
 </td></tr>
 <tr><td>
   <label>
      Team Level:
   </label>
   <input type=text name=level value="<%= t.getLevel() %>" />
 </td></tr>
   <tr><td>
   <label>
      Team Division:
   </label>
   <input type=text name=division value="<%= t.getDivision() %>" />
</td></tr>

  <tr><td>
   <input type=submit name=submit value="Update the Team" />
   </td></tr>
</table>
</form>
</body>
</html>