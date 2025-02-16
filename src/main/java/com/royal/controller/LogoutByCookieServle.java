package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutByCookieServle extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("LogoutByCookieServle : ");
		Cookie cookie[] = request.getCookies();
		
		for (Cookie c : cookie) 
		{
			String userName = c.getValue();
			if (userName!=null) 
			{
				System.out.println(c.getName()+"---"+c.getValue());
				
				Cookie c1= new  Cookie("userName", "");
				response.addCookie(c1);
				
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}
