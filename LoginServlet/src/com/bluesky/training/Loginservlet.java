package com.bluesky.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		int password = Integer.parseInt(request.getParameter("password"));
		PrintWriter writer = response.getWriter();
		if( name.equals("prem") && password==123456) {
		writer.println("Login Successfull");
		writer.println("<h1>Hello Welcome:" + name + "</h1>");
		writer.close();
		}else {
			writer.println("Login UnSuccessfull");
		}
		
	}

	

}
