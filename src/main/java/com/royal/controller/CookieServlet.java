package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Cookie---set into---ClientBrowser
		
		String name = "RahulKirpekar";
		
		Cookie cookie = new Cookie("userName",name);
		
		cookie.setMaxAge(60*60*24);
		
		response.addCookie(cookie);
		
		System.out.println("CookieServlet---Cookie added into Client Browser");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}