package com.revature.sullivan.system;

import java.util.ArrayList;
import java.util.List;

public class CustList {
	
	private static final List<Customers> customerList = new ArrayList<>();
	
	public static List<Customers> getcustomerList() {
		
		return customerList;
		
		
	}
}
