package com.revature.sullivan.system;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class LoginListCust implements Serializable{

	private static final Map<String, String> LoginListCust = new HashMap<>();
	
	public static Map<String, String> getLoginListCust() {
		
		return LoginListCust;
		
	}
	
	
}
