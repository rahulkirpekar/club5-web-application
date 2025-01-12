package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("====EditStudentServlet :: doGet()=====");
	
		response.setContentType("text/html");
		
		PrintWriter out =	response.getWriter();
		
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		StudentDao dao = new StudentDao();
		
		Object obj = dao.getStudentByRno(rno);

		if (obj instanceof StudentBean) 
		{
			StudentBean sbean = (StudentBean)obj;
					
			request.setAttribute("sbean", sbean);
					
			request.getRequestDispatcher("editstudent.jsp").forward(request, response);
		} else 
		{
			request.getRequestDispatcher("registration.html").forward(request, response);
		} 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
