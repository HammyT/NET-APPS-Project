<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Chirp - Add an Organization</title>
</head>
<style>
body { background-image: url("sports.jpg");}
a {color: black;}
td {background-color: brown;}
table, td, tr {boarder: 2px solid black;}
table {width: 100%; border-collapse: collapse;}
h1 {text-align: center}
</style>
<body>
<table>
<form name=addForm action= addOrg method=get >
	<tr>
		<td colspan="2">
			<h1> Sport Chirp - Add an Organization</h1>
		</td>
	</tr>	
	<tr>
		<td>
    		<label>
     			 Org. Name:
   			</label>
   		</td>
   		<td>
   			<input type=text name=name value="" />
   			<br />
		</td>
	</tr>	
	<tr>
		<td>
  			 <label>
     		 Org. Number:
   			 </label>
   		</td>
   		<td>
   			<input type=text name=number value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
   			<label>
      		Org. Address:
   			</label>
   		</td>
   		<td>
   			<input type=text name=address value="" />
   			<br />
   		</td>
   </tr>
   <tr>
  		 <td>
   			<label>
    		  Org. City:
   			</label>
   		  </td>
   		  <td>
   			<input type=text name=city value="" />
   			<br />
  		</td>
   </tr>
   <tr>
   		<td>
      		<label>
      		Org. State:
   			</label>
   		</td>
   		<td>
   			<input type=text name=state value="" />
  			 <br />
   		</td>
   </tr>
   <tr>
   		<td>
      		<label>
      		Org. Region:
   			</label>
   		</td>
   		<td>
  		 	<input type=text name=region value="" />
  			 <br />
   		</td>
   </tr>
   <tr>
   		<td>
         	<label>
     		 Product Zip:
   			</label>
   		</td>
   		<td>
  			 <input type=text name=zip value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
   		 
   		</td>
   		<td>
   		<input type=submit name=submit value="Add the Organization" />
		</td>
	</tr>
</form>
</table>
</body>
</html>