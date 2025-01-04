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


public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("====UpdateStudentServlet===");	
		PrintWriter out = response.getWriter();

		int rno = 	Integer.parseInt(request.getParameter("rno")  );
		String name = request.getParameter("name");
		int std = 	Integer.parseInt(request.getParameter("std")  );
		int marks = Integer.parseInt(request.getParameter("marks"));

		StudentBean sbean = new StudentBean(rno, name, std, marks);
	
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		RequestDispatcher rd = null;
		
		if (rowsAffected > 0) 
		{
			 rd = request.getRequestDispatcher("listStudentServlet");
			
		} else 
		{
				request.setAttribute("rno", rno);
			 rd = request.getRequestDispatcher("editStudentServlet");
		}
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
