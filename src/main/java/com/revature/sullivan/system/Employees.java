package com.revature.sullivan.system;

public class Employees {

	private static final Employees employees = new Employees();
	
	public static Employees getEmployees() {
		
		return employees;
		
	}
	
	private final String USERNAME = "useremployee";
	private final String PASSWORD = "employeepassword";
	
	public String getUsername() {
		
		return USERNAME;
		
	}
	
	public String getPassword() {
		
		return PASSWORD;
		
	}
	
}
