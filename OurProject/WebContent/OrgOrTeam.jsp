<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String name = (String) request.getAttribute("name");

%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Organization or Team</title>
<style>
body { background-image: url("sports.jpg");}
a {color: black;}
td {background-color: brown; text-align: center;}
table {width: 100%;}
</style>
</head>
<body>
<table>
	<tr>
		<td colspan="1">
			<h1>Browse by Organization or by Team! </h1>
		</td>
	</tr>
	<tr>
		<td>
			<p> <a href=readOrgBySport?name=<%=name %> > Organization</a> </p>
		</td>
	</tr>
		<tr>
		<td>
			<p> <a href=readTeamBySport?name=<%=name %>> Team </a></p>
		</td>
	</tr>
</table>
</body>
</html>