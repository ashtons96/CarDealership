package com.revature.sullivan.screen;

import java.util.Scanner;

import com.revature.sullivan.services.LotActionsImpl;
import com.revature.sullivan.services.WebImpl;
import com.revature.sullivan.system.Employees;

public class ScreenEmp implements UserWelcomeScreen{

	public boolean display() {
		
		if(!userVerify()) {
		
			return false;
		}
		
		boolean exitInput = true;
		String input = "";
		
		do {
			Scanner scanner =new Scanner(System.in);
			LotActionsImpl a = new LotActionsImpl();
			WebImpl w = new WebImpl();
			EmployeeImpl e = new EmployeeImpl();
			
			
			System.out.println("What can we do for you today? \n");
			System.out.println("Enter '1' to Add Cars to Lot \n");
			System.out.println("Enter '2' to Remove Cars from Lot \n");
			System.out.println("Enter '3' to Review Offers \n");
			System.out.println("Enter '4' to View Payments \n");
			System.out.println("Enter '9' to Exit Screen");
			
			input = scanner.nextLine();
			
			

			if( input == "1") {
				
				a.addCar();
				exitInput = false;
				
			}else if (input == "2") {
				
				a.removeCar();
				exitInput = false;
			
			}else if ( input == "3") {
				
				e.reviewOffer();
				exitInput = false;
				
			}else if ( input == "4") {
				
				w.viewPayments();
				exitInput = false;
				
			}else if (input == "9") {
				
				System.out.println("Exiting Screen");
				exitInput = true;
				
			}
			
			
		}while (!exitInput);
		
		return false;
		
	}
@Override
	public boolean userVerify() {
		int count = 0;
		String username = "";
		boolean checkUsername = false;
		
		String password = "";
		boolean checkPassword = false;
		
		do {
			
		Scanner scanner = new Scanner(System.in);
			count = 0;
			username = scanner.nextLine();
			
			System.out.println("Enter USERNAME \n");
			if (username.equals(Employees.getEmployees().getUsername())){
				
				checkUsername = true;
				count++;
			
				System.out.println("Enter PASSWORD \n");	
			}if (password.equals(Employees.getEmployees().getPassword())) {
				
				checkPassword = true;
				count++;
				
			}
		}while (!checkUsername && !checkPassword);
		
			
		 if (count == 2) {
			 
			 return true;
		 }else
		
		return false;
	}

}
