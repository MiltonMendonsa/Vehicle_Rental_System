<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Rental System</title>
    <style>
        .navbar {
            overflow: hidden;
            background-color: #333;
        }

        .navbar a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 20px 20px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Clear floats after the nav bar */
        .navbar:after {
            content: "";
            display: table;
            clear: both;
        }
        
        .navbar button{
        	font-size: 15px;
        	margin-top: 10px;
        	padding: 5px;
        }
        
        h1{
         font: bold;
         text-align: center;
        }
        
        form{
        	font-size: 25px;
        	margin: 5px;
        }
        
        .main{
        	display: flex;
        	flex-direction: row;
        	align: center;
        	margin-left: -50px;
        }
        .img{
        	height: 20px;
        	
        }
        p{
        	font-size: 20px;
        	font-weight: bold;
        	text-align: center;
        }
        
        .main2{
        	display: flex;
        	flex-direction: row;
        	align: center;
        	margin-bottom: 50px;
        	margin-left: 80px;
       
        }
        .main2 img{
        	margin-left:50px;
        }
        
        .section{
        	display: flex;
        	margin-top: 400px;
        	margin-left: 550px;
        	margin-bottom: 50px;
        }
        .section button{
        	font-size: 20px;
        	padding: 10px 18px;
        	margin: 10px;
        	border-radius: 10px;
        	background-color: black;
        	color: white;
        }
        .section button:hover{
        	background-color: white;
        	color: black;
        }
        
        .footer{
        	background-color: black;
        	color: white;
        	padding: 2px;
        	
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
        <form action="login.jsp" method="get" style="float: right;">
            <button type="submit">Login</button>
        </form>
        <form action="register.jsp" method="get" style="float: right;">
            <button type="submit">Register</button>
        </form>
    </div>

    <h1>Welcome to Our Vehicle Rental System Website</h1>

	<div class="main">
    <div class="img">
     <img src="rental1.jpg" alt="Image 1">
        <p>Rental Cars</p>
    </div>
    
     <div class="img">
      <img src="rental3.jpg" alt="Image 2">
        <p>Rental MotorCycles</p>
    </div>

    <div class="img">
      <img src="rental2.avif" alt="Image 3">
        <p>Rental ByCycles</p>
    </div>
    </div>
    <br/>
     <div class="section">
    	<a href="add_vehicle.jsp"><button>Add Vehicle</button></a>
    	<a href="availableVehicle"><button>Available Vehicles</button></a>
    </div>
    <br/>
    
    <div class="main2">
    	<img src="rental5.jpg" alt="Image 4">
    	<img src="rental4.jpg" alt="Image 5">
    </div>
    

    
    <div class="footer">
    	<p>Contact : 9739829617</p>
    	<p>&copy; 2024 Vehicle Rental System. All rights reserved.</p>
    </div>
</body>
</html>