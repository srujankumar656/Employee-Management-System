package com.model;

public class Employee {

	private int empId;
	
	private String name;
	
	private String email;
	
	private String phoneNum;
	
	private int salary;
	
	private boolean isActive;

	
	public Employee() {
		super();
	}


	public Employee(int empid, String name, String email, String phoneNum, int salary, boolean isActive) {
		super();
		this.empId = empid;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.salary = salary;
		this.isActive = isActive;
		
	}

	

	public Employee(String name, String email, String phoneNum, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.salary = salary;
	}


	public Employee(int empId, String name, String email, String phoneNum, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpid(int empid) {
		this.empId = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empId + ", name=" + name + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", salary=" + salary + ", isActive=" + isActive + "]";
	}



	
	
	
}
