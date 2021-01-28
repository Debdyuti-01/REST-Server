package com.vogella.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	
	
	public Integer getEmployeeId() 
	{
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getEmailId() 
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	

}
