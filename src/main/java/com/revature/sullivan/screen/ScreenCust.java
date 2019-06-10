package com.revature.sullivan.screen;

import java.util.Scanner;

import com.revature.sullivan.DAO.CustListSerializeDAO;
import com.revature.sullivan.DAO.LoginListSerializeDAO;
import com.revature.sullivan.services.CustServiceImpl;
import com.revature.sullivan.services.LotActionsImpl;
import com.revature.sullivan.system.Customers;


public class ScreenCust implements UserWelcomeScreen {
	
	Customers custLogin;
	
	LoginListSerializeDAO loginList = new LoginListSerializeDAO();
	CustListSerializeDAO customerList = new CustListSerializeDAO();
	
	
	@Override
	
	public boolean display() {
		
		if(!custAccess()) {
			
			return false;
			
		}
		
		boolean exitInput = true;
		
		String input = "";
		
		do {
			Scanner scanner = new Scanner(System.in);
			CustServiceImpl s = new CustServiceImpl();
			LotActionsImpl a = new LotActionsImpl();
			
			System.out.println("What can we do for you today? \n");
			System.out.println(" Enter '1' for All  Available Cars.\n");
			System.out.println(" Enter '2' to Make an Offer on an Available Car.\n");
			System.out.println(" Enter '3' for Your Cars. \n");
			System.out.println(" Enter '4' to see Payments. \n");
			System.out.println(" Enter '9' to Exit Screen");
			
			input = scanner.nextLine();
			
			

			if( input == "1") {
				
				a.viewLot();
				exitInput = false;
				
			}else if (input == "2") {
				
				s.makeOffer(custLogin);
				exitInput = false;
			}else if ( input == "3") {
				
				s.viewCars(custLogin);
				exitInput = false;
				
			}else if ( input == "4") {
				
				s.viewPaymentsOwed();
				exitInput = false;
				
			}else if (input == "9") {
				
				System.out.println("Exiting Screen");
				exitInput = true;
				
			}
			
			
			
			
			
		}while (!exitInput);
		
		return false;
	}

private boolean custAccess() {
		
	
		boolean exitInput = false;
		boolean returnStatement = true;
		String input = "";
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println( "Enter '1' if New User");
			System.out.println( "Enter '2' if Existing User");
			System.out.println( "Enter '3' to Exit Login");
			
			input = scanner.nextLine();
			
			if (input.equals("1")) {
				register();
				
			}else if (input.equals("2")) {
				verifyUser();
				
			}else if (input.equals("3")) {
				exitInput = true;
				returnStatement = false;
				
			}
		}while (!exitInput);
		
		return returnStatement;
	}




	private void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userVerify() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
