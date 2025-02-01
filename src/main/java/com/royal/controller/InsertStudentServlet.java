package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;
import com.royal.util.StringUtils;

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
		StudentBean sbean = new StudentBean();
		boolean flag = false;
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		if (StringUtils.isValidString(name)) 
		{
			sbean.setName(name);
		} else 
		{
			flag = true;
			String nameErr = "<font color='red'>Please enter valid Name</font>";
			request.setAttribute("nameErr", nameErr);
		}

		String stdStr = request.getParameter("std");
		
		if (StringUtils.isValidString(stdStr)) 
		{
			sbean.setStd(Integer.parseInt(stdStr));
		} else 
		{
			flag = true;
			String stdErr = "<font color='red'>Please enter valid Std</font>";
			request.setAttribute("stdErr", stdErr);
		}
		
		String marksStr = request.getParameter("marks");
		
		if (StringUtils.isValidString(marksStr)) 
		{
			sbean.setMarks(Integer.parseInt(marksStr));
		} else 
		{
			flag = true;
			String marksErr = "<font color='red'>Please enter valid Marks</font>";
			request.setAttribute("marksErr", marksErr);
		}

		RequestDispatcher rd = null;
		
		if (flag) 
		{
			request.setAttribute("sbean", sbean);
			rd = request.getRequestDispatcher("registration.jsp");
		} else 
		{
			StudentDao dao = new StudentDao();
			int rowsAffected = dao.insertStudent(sbean);
			if (rowsAffected > 0) 
			{
				rd = request.getRequestDispatcher("listStudentServlet");
			} else 
			{
				 rd = request.getRequestDispatcher("registration.html");
			}
		}
		rd.forward(request, response);
		
	}
}
