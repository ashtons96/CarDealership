package com.revature.sullivan.system;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


public class Customers {

	private int customerIDNumber;
	public String username;
	private String password;
	private Double balance;
	private List<Car> carsOwned;
	private Double monthlyPayment;
	
	
	
	public Customers(String username, String password) {
		
		super();
		
		this.customerIDNumber = CustList.getcustomerList().size();
		this.username = username;
		this.password = password;
		this.balance = 0.00;
		this.carsOwned = new ArrayList<>();
		this.monthlyPayment = 0.00;
		
		
		
	}
	
	public Integer getCustomerIDNumber() {
		
		return customerIDNumber;
		
	}
	
	public void setCustomerIDNumber(Integer customerIDNumber) {
		
		this.customerIDNumber = customerIDNumber;
		
	}
	
	public String getUsername() {
		
		return username;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public Double getBalance() {
		
		return balance;
		
	}

	public List<Car> getcarsOwned(){
		
		return carsOwned;
		
	}
	
	public void setCarsOwned(List<Car> carsOwned) {
		
		this.carsOwned = carsOwned;
		
	}

	public Double getMonthlyPayment() {
		
		return monthlyPayment;
		
	}
}
