package com.user;

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
@WebServlet(value = "/login")

public class Login extends HttpServlet
{
	static String url="jdbc:mysql://localhost:3306/vehicle_rental";
	static String user="root";
	static String password="root";
	
	String u_email;
	String u_pass;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		u_email = req.getParameter("email");
		u_pass = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement s = con.createStatement();
			
			String query = "select * from user";
			
			PrintWriter pw = resp.getWriter();
			ResultSet rs = s.executeQuery(query);
			boolean b = true;
			while(rs.next())
			{
				String email=rs.getString(4);
				String pass=rs.getString(5);
				
				
				if(email.equalsIgnoreCase(u_email) && pass.equalsIgnoreCase(u_pass))
				{
					b=false;
					System.out.println("Login Succesfull");
					pw.print("<html><body><h2>Login Successfull...</h2></body></html>");
					break;
				}
				else 
				{
					continue;
				}
			}

			if(b==true)
			{
				System.out.println("Register First");
				pw.print("<html><body><h2>We Don't have your Data so Please Register First...</h2></body></html>");
				
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.include(req, resp);
			}
			
			if(b==false) 
			{
				RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
				rd.forward(req, resp);
			}
		
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
