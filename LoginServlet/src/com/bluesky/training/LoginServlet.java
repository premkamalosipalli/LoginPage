package com.bluesky.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String username;
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public int password;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		int password = Integer.parseInt(request.getParameter("password"));
		PrintWriter writer = response.getWriter();
		HttpSession session=request.getSession();
		System.out.println(session.getId());
		session.setMaxInactiveInterval(1);
		session.setAttribute("prem", 123456);
		System.out.println(session.getCreationTime());
		System.out.println(session.getAttribute("prem"));
		Cookie[] cookie=request.getCookies();
		System.out.println(cookie[0]);
		if( username.equals("prem") && password==123456) {
		writer.println("Login Successfull");
		writer.println("<h1>Hello Welcome:" + username + "</h1>");
		writer.close();
		}else {
			writer.println("Login UnSuccessfull");
		}
		
	}

	

}
