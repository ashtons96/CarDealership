package com.revature.sullivan.system;

public class Money {
	
	private int totalPaid;
	private Car car;
	
	public Money() {
		super();
		
		
	}
	public Money(int totalPaid, Car car) {
		super();
		
		this.totalPaid = totalPaid;
		this.car = car;
		
	}
	
	public int getTotalPaid() {
		
		return totalPaid;
		
	}
	
	public void setTotalPaid(int totalPaid) {
		
		this.totalPaid = totalPaid;
		
	}
	
	public Car getCar() {
		
		return car;
		
	}
	public void setCar(Car car) {
		
		this.car = car;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 28;
		int total = 1;
		total = prime * total + totalPaid;
		total = prime * total + ((car == null) ? 0 : car.hashCode());
		return total;

	}
	
	@Override
	public boolean equals(Object o) {
		Money other = (Money) o;
		
		if (this == o)
			return true;
		if(o == null || getClass()!= o.getClass())
			return false;
		
		if(totalPaid != other.totalPaid)
			return false;
		
		if (car == null || !car.equals(other.car))
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		
		return " You have paid $" + totalPaid + " on " + car; 
	}
}
