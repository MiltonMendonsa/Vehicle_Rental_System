<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>available vehicle</title>
</head>
<body>
	<%	
		ResultSet rs =(ResultSet)request.getAttribute("rsdata");
		
		while(rs.next())
		{
	%>
			<h2> Vehicle Type : <% out.print(rs.getString(1)); %></h2>
			<% out.print(rs.getString(2));
			out.print(rs.getString(3));
			out.print(rs.getString(4));
		}
	%>
	
</body>
</html>