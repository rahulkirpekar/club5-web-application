package com.royal.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class TestServletRequestListener implements ServletRequestListener 
{
	public void requestInitialized(ServletRequestEvent sre) 
	{
		System.out.println("TestServletRequestListener : requestInitialized()");
	}
	public void requestDestroyed(ServletRequestEvent sre) 
	{
		System.out.println("TestServletRequestListener : requestDestroyed()");
	}
}
