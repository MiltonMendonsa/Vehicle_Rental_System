package com.vehicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/availableVehicle")

public class Available_Vehicle extends HttpServlet
{
	static String url="jdbc:mysql://localhost:3306/vehicle_rental";
	static String user="root";
	static String password="root";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement s = con.createStatement();
			
			String query = "select * from vehicles";
			
			ResultSet rs = s.executeQuery(query);
			req.setAttribute("rsdata", rs);
					
			RequestDispatcher rd = req.getRequestDispatcher("available_vehicle.jsp");
			rd.forward(req, resp);
			
			con.close();

		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
