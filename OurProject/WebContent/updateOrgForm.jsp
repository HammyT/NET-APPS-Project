<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Organization" %>       
<% Organization org = (Organization) request.getAttribute("org"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Update a Organization</title>
</head>
<body>
<h1> Sport Chirp - Update a Organization</h1>

<form name=updateForm action=updateOrg method=get >

    <label>
      Org. Name:
   </label>
   <input type=text name=name value="<%= org.getName() %>" />
   <br />

   <label>
      Org. Number:
   </label>
   <input type=text name=number value="<%= org.getNumber() %>" />
   <br />
   <label>
      Org. Address:
   </label>
   <input type=text name=address value="<%= org.getAddress() %>" />
   <br />
   
   <label>
      Org. City:
   </label>
   <input type=text name=city value="<%= org.getCity() %>" />
   <br />
   
      <label>
      Org. State:
   </label>
   <input type=text name=state value="<%= org.getState() %>" />
   <br />
   
      <label>
      Org. Region:
   </label>
   <input type=text name=region value="<%= org.getRegion() %>" />
   <br />
   
         <label>
      Product Zip:
   </label>
   <input type=text name=zip value="<%= org.getZip() %>" />
   <br />
   
   <input type=submit name=submit value="Update the Organization" />

</form>
</body>
</html>