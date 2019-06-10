package com.revature.sullivan.services;

import java.util.Scanner;

import com.revature.sullivan.system.Car;
import com.revature.sullivan.system.Customers;
import com.revature.sullivan.system.Lot;

public class CustServiceImpl implements CustServiceInt{
	
@Override
	public void makeOffer(Customers custLogin) {
		
		String VINInput = "";
		String offerPrice = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the Vehicle Identification Number (VIN) you want to make an offer on \n");
		VINInput = scanner.nextLine();
		
		System.out.println("Please enter an offer for the car. \n");
		offerPrice = scanner.nextLine();
		
		Car carOffer = null;
		
		Integer intVINInput = Integer.parseInt(VINInput);
		Integer intOfferPrice = Integer.parseInt(offerPrice);
//		
//		for (int c = 0; c < Lot.getLot().size(); c++ ) {
//			if (Lot.getLot().get(c).getVIN() == intVINInput) {
//				
//				carOffer = Lot.getLot().get(c);			
//				
//			}
			
			
			
	//	}
	}


	//	OffersList.getOffersList().add(new Offers(carOffer, verifyUser, intOfferPrice));
		

	public void viewCars(Customers verifyUser) {
		
		if (verifyUser.getcarsOwned().size() == 0) {
			System.out.println("NO CARS TO SHOW");
		}else for(int c = 0; c < verifyUser.getcarsOwned().get(c); c++) {
			
			System.out.println("\n" + verifyUser.getcarsOwned().get(c));
		}
		
	}
		
	

	public void viewPaymentsOwed() {
		// TODO Auto-generated method stub
		
	}

}
