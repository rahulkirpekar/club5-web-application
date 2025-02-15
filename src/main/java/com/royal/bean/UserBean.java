package com.royal.bean;

public class UserBean 
{
	private int id;
	private String email;
	private String passsword;
	
	public UserBean() 
	{
	}
	public UserBean(int id, String email, String passsword) 
	{
		this.id = id;
		this.email = email;
		this.passsword = passsword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	
	

}
