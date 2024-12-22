package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int std = 	Integer.parseInt(request.getParameter("std")  );
		int marks = Integer.parseInt(request.getParameter("marks"));

		StudentBean sbean = new StudentBean(0, name, std, marks);
	
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		RequestDispatcher rd = null;
		
		if (rowsAffected > 0) 
		{
			 rd = request.getRequestDispatcher("listStudentServlet");
			
		} else 
		{
			 rd = request.getRequestDispatcher("registration.html");
		}
		rd.forward(request, response);
	}
}
