<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    String table = (String) request.getAttribute("table");
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Coaches</title>
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
		<td colspan="2">
			<h1>List of coaches!</h1>
		</td>
	</tr>
	<tr>
		<td>
			<p> <%=table %> </p>
		</td>
	</tr>


</table>

</body>
</html>