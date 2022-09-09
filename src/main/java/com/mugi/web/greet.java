package com.mugi.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class greet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String Email=req.getParameter("email");
		String Pass=req.getParameter("pass");
		
		
		
		RequestDispatcher rd;
		
		if("mugeshaanoor@gmail.com".equals(Email) && "demo".equals(Pass)) {
			rd=req.getRequestDispatcher("/server2");
			rd.forward(req, res);
			
		}else {
			pw.println("<h1>Login unauthentication</h1>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
		
		
		
		pw.println("<h1>Pass: </h1>"+Pass);
		
		
		
		
	}
	
	
	

}
