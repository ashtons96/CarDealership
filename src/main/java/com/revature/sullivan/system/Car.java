package com.revature.sullivan.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car  implements Serializable{
	
	private List<Offers> OffersList;
	private  String carMakeAndModel;
	private Integer price;
	public Boolean carAvailable;
	private String carOwner;
	private Integer VIN;
	
	public Car(String carOwner, String carMakeAndModel, Boolean carAvailable, Integer price, Integer VIN  ) {
		
		this.carAvailable = carAvailable;
		this.carMakeAndModel = carMakeAndModel;
		this.carOwner = carOwner;
		this.price = price;
		this.VIN = VIN;
		this.OffersList = new ArrayList<Offers>();
		
	}
	
	public Boolean getCarAvailable() {
		
		return carAvailable;
		
	}
	
	public String getCarMakeandModel() {
		
		return carMakeAndModel;
		
	}
	
	public String getCarOwner() {
		
		return carOwner;
		
	}
	
	public Integer getPrice() {
		
		return price;
		
	}

	public Integer getVIN() {
		
		return VIN;
		
	}

	public List<Offers> getOffersList() {
		
		return OffersList;
		
	}

	public void setCarAvailable( Boolean carAvailable ) {
		
		this.carAvailable = carAvailable;
		
	}

	public void setCarMakeandModel( String carMakeAndModel) {
		
		this.carMakeAndModel = carMakeAndModel;
		
	}

	public void setCarOwner(String carOwner) {
		
		this.carOwner = carOwner;
		
	}

	public void setPrice( Integer price) {
		
		this.price = price;
		
	}

	public void setVin( Integer VIN) {
		
		this.VIN = VIN;
		
	}

	public void setOffersList( List<Offers> OffersList) {
		
		this.OffersList = OffersList;
		
	}


	@Override
	public String toString() {
		
		return  "Car /n" + carMakeAndModel +" " + VIN + "/nOwner: " + carOwner + "/nCar Available?: " + carAvailable
				+ "/nPrice" + price + "/nOffers:" + OffersList;
		
	}
	
	@Override
	
	public int hashCode() {
		
		final int num = 28;
		int total = 1;
		
		total = num * total + ((carAvailable == null) ? 0: carAvailable.hashCode());
		total = num * total + ((carMakeAndModel == null) ? 0: carMakeAndModel.hashCode());
		total = num * total + ((carOwner == null) ? 0: carOwner.hashCode());
		total = num * total + ((price == null) ? 0: price.hashCode());
		
		return total;
		
	}

	@Override
	
	public boolean equals(Object o) {
		if (this == o)
		
			return true;
		
		else if (getClass() != o.getClass() || o == null)
			
			return false;
		
		Car next = (Car) o;
		
		if (carMakeAndModel == null) {
	
			if (next.carMakeAndModel != null)
			 return false;
		 
		}else if (!carMakeAndModel.equals(next.carMakeAndModel))
			
			return false;
		
		if (carAvailable == null) {
			
			if (next.carAvailable != null)
			 return false;
		 
		}else if (!carAvailable.equals(next.carAvailable))
			
			return false;
		
		if (carOwner == null) {
			
			if (next.carOwner != null)
			 return false;
		 
		}else if (!carOwner.equals(next.carOwner))
			
			return false;
		
		if (price == null) {
			
			if (next.price != null)
			 return false;
		 
		}else if (!price.equals(next.price))
			
			return false;
		
		
		return true;
		
	}

	
}
