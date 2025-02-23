package com.royal.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

//@WebFilter("/*")
public class TestFilter extends HttpFilter implements Filter 
{

	public void init(FilterConfig fConfig) throws ServletException 
	{
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here

		// Pre--filtering
		System.out.println("TestFilter : doFilter()--Pre-Filtering");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);

		// Post-Filtering
		System.out.println("TestFilter : doFilter()--Post-Filtering");

	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
