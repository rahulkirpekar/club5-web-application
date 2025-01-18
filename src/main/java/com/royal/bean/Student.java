package com.royal.bean;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String gender;
    private String address;
    private String course;
    private String batchTime;
    private String paymentMode;
    private List<String> extracurricularActivities;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(String batchTime) {
		this.batchTime = batchTime;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public List<String> getExtracurricularActivities() {
		return extracurricularActivities;
	}
	public void setExtracurricularActivities(List<String> extracurricularActivities) {
		this.extracurricularActivities = extracurricularActivities;
	}

    // Getters and setters
    // (Generate them using your IDE or manually write them)
    
    
}
