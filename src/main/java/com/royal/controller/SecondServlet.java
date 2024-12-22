package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String color[] = {"#FF0000","#008000","#0000FF","#FFFF00","#00FFFF","#FF00FF","#FFA500","#800080","#FFC0CB","#A52A2A","#808080","#008080","#00FF00","#000080","#FFD700","#800000","#808000","#C0C0C0","#006400","#87CEEB","#FF7F50","#40E0D0","#FA8072","#4B0082","#DDA0DD","#F0E68C","#DC143C","#E6E6FA","#CD853F","#20B2AA"};
		// set MIME -- into response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String valueStr = request.getParameter("value");
		
		int no = Integer.parseInt(valueStr);
		int o=0;
		int l=2,m;
		boolean flag=true;
		
		
		for (int i = 1; i <= no; i++) 
		{
			for (int k = (no-i); k >=0; k--) 
			{
				out.print("&nbsp");
			}
			for (int j = 1; j <=i; ) 
			{
				flag=true;
				for(m=2;m<l;m++) 
				{
					if(l%m==0) 
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					out.print("<font color='"+color[o++]+"'>"+l+"&nbsp</font>");
					j++;
				}
				l++;
			}
			out.println("<br>");
		}
		for (int i = (no-1); i >=1; i--) 
		{
			for (int k = (no-i); k >=0; k--) 
			{
				out.print("&nbsp");
			}
			for (int j = 1; j <=i; ) 
			{
				flag=true;
				for(m=2;m<l;m++) 
				{
					if(l%m==0) 
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					out.print("<font color='"+color[o++]+"'>"+l+"&nbsp</font>");
					j++;
				}
				l++;
			}
			out.println("<br>");
		}
	}
}









