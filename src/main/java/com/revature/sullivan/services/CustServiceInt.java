package com.revature.sullivan.services;

import com.revature.sullivan.system.Customers;

public interface CustServiceInt {

  public void makeOffer (Customers verifiedCustomer);
  public void ownedCars (Customers verifiedCustomer);
  public void viewPaymentsDue (Customers verifiedCustomer);
  public void viewPaymentsMade (Customers verifiedCustomer);
  
}
