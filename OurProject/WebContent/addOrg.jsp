<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Add an Organization</title>
</head>
<body>
<h1> Sport Chirp - Add an Organization</h1>

<form name=addForm action= addOrg method=get >

    <label>
      Org. Name:
   </label>
   <input type=text name=name value="" />
   <br />

   <label>
      Org. Number:
   </label>
   <input type=text name=number value="" />
   <br />
   <label>
      Org. Address:
   </label>
   <input type=text name=address value="" />
   <br />
   
   <label>
      Org. City:
   </label>
   <input type=text name=city value="" />
   <br />
   
      <label>
      Org. State:
   </label>
   <input type=text name=state value="" />
   <br />
   
      <label>
      Org. Region:
   </label>
   <input type=text name=region value="" />
   <br />
   
         <label>
      Product Zip:
   </label>
   <input type=text name=zip value="" />
   <br />
   
   <input type=submit name=submit value="Add the Organization" />

</form>
</body>
</html>