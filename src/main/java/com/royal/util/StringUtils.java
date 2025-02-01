package com.royal.util;

public class StringUtils 
{
	public static boolean isValidString(String value) 
	{
		return (((value != null) && (value.trim().length() > 0)) ? true : false);  
		
//		if((value != null) && (value.trim().length() > 0)) 
//		{
//			return true;
//		}
//		return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("StringUtils.isValidString(\"\") : " + StringUtils.isValidString("aa"));
		
	}
}
