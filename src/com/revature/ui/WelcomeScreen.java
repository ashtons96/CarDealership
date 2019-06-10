package src.com.revature.ui;

import com.revature.pojo.CarDealership;

public class WelcomeScreen implements Screen {

	public static final String WELCOME_MESSAGE = "\"Welcome to the Car Dealership Website! /n Press 1 for Customer or 2 for Employee\"";
 
	@Override	
	public void display(CarDealership website) {
	System.out.println(WELCOME_MESSAGE);
	
	}
}
