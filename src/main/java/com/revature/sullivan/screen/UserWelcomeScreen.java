package com.revature.sullivan.screen;


public interface UserWelcomeScreen {
	
	public boolean display();
	
	public static final String WELCOME_MESSAGE = "\"Welcome to the Car Dealership Website! /n Press 1 for Customer or 2 for Employee\"";

	boolean userVerify();
}
