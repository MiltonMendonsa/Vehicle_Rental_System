<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add vehicles</title>
<style>
body{
	text-align:center;
}
form{
	background-color:#E0E0E0;
	border: 2px solid Black;
	margin : 40px 260px;
	padding: 20px 2px;
	border-radius: 20px;
	font-size: 25px;
}
input{
	padding : 6px 34px;
	border-radius: 8px;
	font-size: 20px;
}
select{
	padding : 6px 34px;
	border-radius: 8px;
	font-size: 20px;
}
label{
	font-weight: bold;
	font-size: 28px;
	border-radius: 8px;
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
	<h2>Add Vehicle</h2>
	<form action="addVehicle" method="get">
        <label for="vehicleType">Vehicle Type:</label>
        <!-- <select name="vehicleType" id="vehicleType">
            <option value="car">Car</option>
            <option value="bike">Bike</option>
        </select> -->
        <input type="text" name="vehicleType" id="vehicleType" placeholder="Bike / Car">  
        <br><br>
        
        <label for="regNumber">Registration Number:</label>
        <input type="text" name="regNumber" id="regNumber"><br><br>
        
        <label for="insuranceStatus">Insurance Status:</label>
        <input type="text" name="insuranceStatus" id="insuranceStatus"><br><br>
        
        <label for="place">Place:</label>
        <input type="text" name="place" id="place"><br><br>
        
        <input type="submit" value="Add Vehicle">
    </form>
</body>
</html>