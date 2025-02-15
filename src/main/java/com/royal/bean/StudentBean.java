package com.royal.bean;

public class StudentBean 
{
	private Integer rno;
	private String name;
	private Integer std;
	private Integer marks;
	
	public StudentBean() 
	{
	}
	
	public StudentBean(Integer rno, String name, Integer std, Integer marks) {
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStd() {
		return std;
	}
	public void setStd(Integer std) {
		this.std = std;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	
}
