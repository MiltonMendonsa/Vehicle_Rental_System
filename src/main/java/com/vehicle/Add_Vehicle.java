package com.vehicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/addVehicle")

public class Add_Vehicle extends HttpServlet
{
	static String url="jdbc:mysql://localhost:3306/vehicle_rental";
	static String user="root";
	static String password="root";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String vehicleType = req.getParameter("vehicleType");
	    String regNumber = req.getParameter("regNumber");
	    String insuranceStatus = req.getParameter("insuranceStatus");
	    String place = req.getParameter("place");
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = con.prepareStatement("insert into vehicles values(?,?,?,?)");
			
				ps.setString(1, vehicleType);
				ps.setString(2, regNumber);
				ps.setString(3, insuranceStatus);
				ps.setString(4, place);
				ps.executeUpdate();
			
			con.close();
			
			System.out.println("vehicle added");		
			PrintWriter p = resp.getWriter();
			p.print("<html><body><h2>Vehicle added Successfully...</h2></body></html>");	
		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
}
