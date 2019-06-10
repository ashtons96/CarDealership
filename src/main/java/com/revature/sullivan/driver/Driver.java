package com.revature.sullivan.driver;

import com.revature.sullivan.screen.ScreenEmp;
import com.revature.sullivan.screen.ScreenCust;
import com.revature.sullivan.services.WebImpl;

public class Driver {

	public static void main(String[] args) {
		WebImpl web = new WebImpl();
		
		boolean continueRun = true;
		
		do {
			
			String screen = web.startUpScreen();
			
			if (screen.equals("customer")) {
				
				ScreenCust c = new ScreenCust();
				
			if (!c.display()) {
				
				continue;
				
			}
		}else if (screen.equals("employee")) {
			
			ScreenEmp e = new ScreenEmp();
			
			if(!e.display())
				
				continue;
			
		}
	}while (continueRun);

	}

}
