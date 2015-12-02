<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Team Page</title>
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
			<h1> Sport Chirp - Add a Team</h1>
		</td>
	</tr>	
	<tr>
		<td>
    		<label>
     			 Team ID:
   			</label>
   		</td>
   		<td>
   			<input type=text name=teamID value="" />
   			<br />
		</td>
	</tr>	
	<tr>
		<td>
  			 <label>
     		 Team Name
   			 </label>
   		</td>
   		<td>
   			<input type=text name=teamName value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
   			<label>
      		Head Coach
   			</label>
   		</td>
   		<td>
   			<input type=text name=headCoach value="" />
   			<br />
   		</td>
   </tr>
   <tr>
  		 <td>
   			<label>
    		  Level
   			</label>
   		  </td>
   		  <td>
   			<input type=text name=level value="" />
   			<br />
  		</td>
   </tr>
   <tr>
   		<td>
      		<label>
      		Division
   			</label>
   		</td>
   		<td>
   			<input type=text name=Division value="" />
  			 <br />
   		</td>
   </tr>
   <tr>
   		<td>
      		<label>
      		Organization Name:
   			</label>
   		</td>
   		<td>
  		 	<input type=text name=orgName value="" />
  			 <br />
   		</td>
   </tr>
   <tr>
   		<td>
         	<label>
     		 Sport played:
   			</label>
   		</td>
   		<td>
  			 <input type=text name=sportName value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
         	<label>
     		 School:
   			</label>
   		</td>
   		<td>
  			 <input type=text name=schoolName value="" />
  			 <br />
   		</td>
   	</tr>
   	<tr>
   		<td>
   		 
   		</td>
   		<td>
   		<input type=submit name=submit value="Add the Team" />
		</td>
	</tr>
</form>
</table>



</body>
</html>