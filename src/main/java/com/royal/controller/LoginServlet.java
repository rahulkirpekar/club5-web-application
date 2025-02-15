package com.royal.controller;

import java.io.IOException;

import com.royal.bean.UserBean;
import com.royal.dao.UserDao;
import com.royal.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		if (StringUtils.isValidString(userName) && StringUtils.isValidString(password)) 
		{
			UserDao userDao = new UserDao();
			UserBean userBean = userDao.authenticateLogin(userName, password);
			
			if (userBean!=null) 
			{
				System.out.println("Authenticate User : " + userName);
				HttpSession session = request.getSession();
				session.setAttribute("userBean", userBean);
				rd = request.getRequestDispatcher("registration.jsp");
				
			} else 
			{
				rd = request.getRequestDispatcher("login.jsp");
			}
		} else 
		{
			rd = request.getRequestDispatcher("login.jsp");
		}
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
