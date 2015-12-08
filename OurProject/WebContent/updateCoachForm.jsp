<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Coach" %>       
<% Coach c = (Coach) request.getAttribute("coach"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update Coach</title>
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
<h1> Sport Chirp - Update a Coach</h1>
</td></tr>
<form name=updateForm action=updateCoach method=get >

	<tr><td>
    <label>
      Coach ID:
   </label>
   <input type=text name=id value="<%= c.getId() %>" required/>
 	</td></tr>
<tr><td>
   <label>
     Coach First Name:
   </label>
   <input type=text name=fName value="<%= c.getfName() %>" required/>
 </td></tr>
 <tr><td>
   <label>
      Coach Last Name:
   </label>
   <input type=text name=lName value="<%= c.getlName() %>" required/>
 </td></tr>

  <tr><td>
   <input type=submit name=submit value="Update the Coach" />
   </td></tr>
</table>
</form>
</body>
</html>