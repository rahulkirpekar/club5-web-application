package com.royal.listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;

public class TestServletAttributeListener implements ServletRequestAttributeListener 
{
	public void attributeAdded(ServletRequestAttributeEvent srae) 
	{
		System.out.println("TestServletAttributeListener : attributeAdded()");
	}
	public void attributeReplaced(ServletRequestAttributeEvent srae) 
	{
		System.out.println("TestServletAttributeListener : attributeReplaced()");
	}
	public void attributeRemoved(ServletRequestAttributeEvent srae) 
	{
		System.out.println("TestServletAttributeListener : attributeRemoved()");
	}
}
