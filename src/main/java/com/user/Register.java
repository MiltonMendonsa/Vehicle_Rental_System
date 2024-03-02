package com.user;

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
@WebServlet(value = "/register")

public class Register extends HttpServlet 
{
	static String url="jdbc:mysql://localhost:3306/vehicle_rental";
	static String user="root";
	static String password="root";
	
	String username;
	int age;
	long number;
	String email;
	String pass;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		username = req.getParameter("username");
		String age2 = req.getParameter("age");
		age = Integer.parseInt(age2);
		String number2 = req.getParameter("number");
		number = Long.parseLong(number2);
		email = req.getParameter("email");
		pass = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
			
				ps.setString(1, username);
				ps.setInt(2, age);
				ps.setLong(3, number);
				ps.setString(4, email);
				ps.setString(5, pass);
				ps.executeUpdate();
			
			con.close();
			
			System.out.println("Registerd");		
			PrintWriter p = resp.getWriter();
			p.print("<html><body><h2>Registerd Successfully...</h2></body></html>");	
		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.include(req, resp);
	}
}
