package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.print("<h3>Student Record Page</h3>");
		
		out.print("<table border='1'>              ");
		out.print("	<tr>                ");
		out.print("		<td>Rno</td>    ");
		out.print("		<td>Name</td>   ");
		out.print("		<td>Std</td>    ");
		out.print("		<td>Marks</td>  ");
		out.print("		<td>Action</td>  ");
		
		out.print("	</tr>               ");

		StudentDao dao = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for(int i = 0 ; i < list.size() ; i++) 
		{
			StudentBean s = list.get(i);
			
			out.print("	<tr>                ");
			out.print("		<td>"+s.getRno()+"</td>    ");
			out.print("		<td>"+s.getName()+"</td>   ");
			out.print("		<td>"+s.getStd()+"</td>    ");
			out.print("		<td>"+s.getMarks()+"</td>  ");
			out.print("		<td><a href='#'>EDIT</a> | <a href='#'>DELETE</a> </td>  ");
			out.print("	</tr>               ");
			
		}
		out.print("</table>				");
	}
}
