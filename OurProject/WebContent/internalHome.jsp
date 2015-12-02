<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Internal Home Page</title>
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
			<h1>Welcome Administrator!</h1>
		</td>
	</tr>
	<tr>
		<td>
			<p> <a href="sportList.jsp">Click Here</a> to Search by Sport </p>
		</td>
		<td>
		<form>
			<label>Search By: </label>
			<input list="search" name="searchType" placeholder="Select a Field..." />
			</label>
				<datalist id="search">
					<option value="Sport"/>
					<option value="Team Name"/>
					<option value="Location"/>
			</datalist>
			 
			<input type="text" name="searchR" placeholder="Search..."/>
			<input type="submit" value="Submit"/>
			</form>
		</td>
	</tr>


</table>
</body>
</html>

