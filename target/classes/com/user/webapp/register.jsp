<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<style>
body{
	text-align:center;
}
form{
	background-color:#E0E0E0;
	border: 2px solid Black;
	margin : 40px 260px;
	border-radius: 20px;
	font-size: 25px;
}
input{
	padding : 6px 34px;
	border-radius: 8px;
	font-size: 20px;
}
form input[type="submit"]
{
	font-weight: bold;
	font-size: 20px;
	border-radius: 8px;
}
h2{
	background-color:#B8B8B8;
	padding : 8px 2px;
	margin-top:-0px;
	border-radius: 18px;
}
</style>
</head>
<body>
	<form action="register">
		<h2>Register</h2>
		Enter User Name <input type="text" name="username">
		<br><br>
		Enter Age <input type="number" name="age">
		<br><br>
		Enter Phone Number <input type="number" name="number">
		<br><br>
		Enter Email <input type="email" name="email">
		<br><br>
 		Enter Password <input type="text" name="password">
		<br><br>
		<input type="submit" value="Submit">
		<br><br> 
	</form>
</body>
</html>