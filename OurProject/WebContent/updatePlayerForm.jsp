<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Player" %>       
<% Player p = (Player) request.getAttribute("player"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update Player</title>
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
<h1> Sport Chirp - Update a Player</h1>
</td></tr>
<form name=updateForm action=updatePlayer method=get >

	<tr><td>
    <label>
      Player ID:
   </label>
   <input type=text name=id value="<%= p.getId() %>" />
 	</td></tr>
<tr><td>
   <label>
     Player First Name:
   </label>
   <input type=text name=fName value="<%= p.getfName() %>" />
 </td></tr>
 <tr><td>
   <label>
      Player Last Name:
   </label>
   <input type=text name=lName value="<%= p.getlName() %>" />
 </td></tr>
 <tr><td>
   <label>
      Player Gender:
   </label>
   <input type=text name=gender value="<%= p.getGender() %>" />
 </td></tr>
  <tr><td>
   <label>
      Player Age:
   </label>
   <input type=text name=age value="<%= p.getAge() %>" />
 </td></tr>
  <tr><td>
   <input type=submit name=submit value="Update the Player" />
   </td></tr>
</table>
</form>
</body>
</html>