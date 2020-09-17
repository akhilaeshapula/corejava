package com.training.example.three;

import com.training.ifaces.Rental;

public class Shop {
	
	public Rental getDetails(int key){
		switch(key){
		case 1:
			return new Computers(2,200,2);
		case 2:
			return new Furniture(1,300,10);
		default:
			return null;
		}	
	}
	public double calcRent(Rental polyRent){
		double totalAmount=0.00;
		totalAmount= polyRent.calcRent();
		return totalAmount;
	}

}
