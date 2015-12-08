<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Sport" %>       
<% Sport s = (Sport) request.getAttribute("sport"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update a Sport</title>
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
<h1> Sport Chirp - Update a Sport</h1>
</td></tr>
<form name=updateForm action=updateSport method=get >

   <tr><td>
      <label>
      Sport Name:
   </label>
   <input type=text name=name value="<%= s.getName() %>" />
  </td></tr>
	<tr><td>
    <label>
      Sport Description:
   </label>
   <input type=text name=description value="<%= s.getDescription() %>" />
 	</td></tr>

  <tr><td>
   <input type=submit name=submit value="Update the Sport" />
   </td></tr>
</table>
</form>
</body>
</html>