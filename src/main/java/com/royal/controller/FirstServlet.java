package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// HttpServlet---[servlet-api.jar]

public class FirstServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		PrintWriter out = response.getWriter();
//		out.println("<h1>FirstServlet :: Hello World</h1>");
		
		System.out.println("FirstServlet : service()");
	}
}
