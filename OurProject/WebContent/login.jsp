<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<form id="loginForm" action="Login" method="post">
	<h1>Login Here:</h1>	
	<br>
	<input type="text" name="username" placeholder="Username.." required>
	<br>
	<input type="password" name="password" placeholder="Password.." required>
	<br>
	<input type="submit" value="Login">
	$(errorMessage)
	</form>

</body>
</html>