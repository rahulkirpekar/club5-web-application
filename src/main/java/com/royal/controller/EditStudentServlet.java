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
			StudentBean s = (StudentBean)obj;
					
			out.print("<h3>Student Registration Page</h3>                       ");
			out.print("<form action='updateStudentServlet' method='post'>       ");
			out.print("	<table>                                                 ");
			out.print("		<tr>                                                ");
			out.print("			<td>Rno </td>                                  ");
			out.print("			<td><input type='text' name='rno' value="+s.getRno()+" readonly> </td>       ");
			out.print("		</tr>                                               ");

			out.print("		<tr>                                                ");
			out.print("			<td>Name </td>                                  ");
			out.print("			<td><input type='text' name='name' value="+s.getName()+"> </td>       ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td>Std</td>                                    ");
			out.print("			<td><input type='text' name='std' value="+s.getStd()+"> </td>        ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td>Marks</td>                                  ");
			out.print("			<td><input type='text' name='marks' value="+s.getMarks()+"> </td>      ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td></td>                                       ");
			out.print("			<td><input type='submit'> </td>                 ");
			out.print("		</tr>                                               ");
			out.print("	</table>                                                ");
			out.print("</form>													");
					
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
