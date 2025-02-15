package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.royal.bean.UserBean;
import com.royal.util.DBConnection;

public class UserDao 
{
	public UserBean authenticateLogin(String email,String password)
	{
		String selectQuery = "SELECT * FROM USER WHERE email='"+email+"' and PASSWORD='"+password+"'";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		UserBean userBean  = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				if (rs.next()) 
				{
					userBean  = new UserBean(rs.getInt(1), rs.getString(2), rs.getString(3));
					System.out.println("userBean===>"+userBean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected : " + conn);
		}
		return userBean;
	}
}
