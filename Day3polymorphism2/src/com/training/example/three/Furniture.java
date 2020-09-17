package com.training.example.three;

import com.training.ifaces.Rental;

public class Furniture implements Rental {
	private int quant;
	private int ratePerUnit;
	private int noOfDays;
	
	public Furniture(int quant, int ratePerUnit, int noOfDays) {
		super();
		this.quant = quant;
		this.ratePerUnit = ratePerUnit;
		this.noOfDays = noOfDays;
	}

	@Override
	public double calcRent() {
		double cost=0.00;
		cost=this.quant*this.noOfDays*this.ratePerUnit;
		return cost;
		
	}
	

}
