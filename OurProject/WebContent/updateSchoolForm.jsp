<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.School" %>       
<% School s = (School) request.getAttribute("school"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update a School</title>
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
<h1> Sport Chirp - Update a School</h1>
</td></tr>
<form name=updateForm action=updateSchool method=get >

   <tr><td>
      <label>
      School ID:
   </label>
   <input type=text name=id value="<%= s.getId() %>" />
  </td></tr>
	<tr><td>
    <label>
      School Name:
   </label>
   <input type=text name=name value="<%= s.getName() %>" />
 	</td></tr>
<tr><td>
   <label>
      School Number:
   </label>
   <input type=text name=number value="<%= s.getNumber() %>" />
 </td></tr>
 <tr><td>
   <label>
      School Address:
   </label>
   <input type=text name=address value="<%= s.getAddress() %>" />
 </td></tr>
   <tr><td>
   <label>
      School City:
   </label>
   <input type=text name=city value="<%= s.getCity() %>" />
</td></tr>
   <tr><td>
   <label>
      School State:
   </label>
   <input type=text name=state value="<%= s.getState() %>" />
</td></tr>
   <tr><td>
   <label>
      School Zip:
   </label>
   <input type=text name=zip value="<%= s.getZip() %>" />
</td></tr>
   <tr><td>
   <label>
      School Region:
   </label>
   <input type=text name=region value="<%= s.getRegion() %>" />
</td></tr>
   <tr><td>
   <label>
      School Country:
   </label>
   <input type=text name=country value="<%= s.getCountry() %>" />
</td></tr>
   <tr><td>
   <label>
      School Admission UrL:
   </label>
   <input type=text name=admissionUrl value="<%= s.getAdmissionUrl() %>" />
</td></tr>
   <tr><td>
   <label>
      School Financial Aid Url:
   </label>
   <input type=text name=financialUrl value="<%= s.getFinancialUrl() %>" />
</td></tr>
   <tr><td>
   <label>
      School Application Url:
   </label>
   <input type=text name=applicationUrl value="<%= s.getApplicationUrl() %>" />
</td></tr>
   <tr><td>
   <label>
      School Net Price Url:
   </label>
   <input type=text name=priceUrl value="<%= s.getPriceUrl() %>" />
</td></tr>
   <tr><td>
   <label>
      School Email:
   </label>
   <input type=text name=email value="<%= s.getEmail() %>" />
</td></tr>
  <tr><td>
   <input type=submit name=submit value="Update the School" />
   </td></tr>
</table>
</form>
</body>
</html>