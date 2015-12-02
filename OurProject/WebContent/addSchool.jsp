<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add School Page</title>
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
<form name=addForm action= addOrg method=get >
	<tr>
		<td colspan="2">
			<h1> Sport Chirp - Add a Sport</h1>
		</td>
	</tr>	
	<tr>
		<td>
    		<label>
     			 Sport Name
   			</label>
   		</td>
   		<td>
   			<input type=text name=Sportname value="" />
   			<br />
		</td>
	</tr>	
	<tr>
		<td>
  			 <label>
     		 Sport Description
   			 </label>
   		</td>
   		<td>
   			<input type=text name=SportDiscription value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
   		 
   		</td>
   		<td>
   		<input type=submit name=submit value="Add the Sport" />
		</td>
	</tr>
</form>
</table>
</body>
</html>