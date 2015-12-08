<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Organization" %>       
<% Organization org = (Organization) request.getAttribute("org"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update an Organization</title>
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
<h1> Sport Chirp - Update a Organization</h1>
</td></tr>
<form name=updateForm action=updateOrg method=get >

	<tr><td>
    <label>
      Org. Name:
   </label>
   <input type=text name=name value="<%= org.getName() %>" required/>
 	</td></tr>
<tr><td>
   <label>
      Org. Number:
   </label>
   <input type=text name=number value="<%= org.getNumber() %>" required/>
 </td></tr>
 <tr><td>
   <label>
      Org. Address:
   </label>
   <input type=text name=address value="<%= org.getAddress() %>" required/>
 </td></tr>
   <tr><td>
   <label>
      Org. City:
   </label>
   <input type=text name=city value="<%= org.getCity() %>" required/>
</td></tr>
   <tr><td>
      <label>
      Org. State:
   </label>
   <input type=text name=state value="<%= org.getState() %>" required/>
  </td></tr>
  <tr><td>
      <label>
      Org. Region:
   </label>
   <input type=text name=region value="<%= org.getRegion() %>" required/>
  </td></tr>
   <tr><td>
         <label>
      Product Zip:
   </label>
   <input type=text name=zip value="<%= org.getZip() %>" required/>
</td></tr>
  <tr><td>
   <input type=submit name=submit value="Update the Organization" />
   </td></tr>
</table>
</form>
</body>
</html>