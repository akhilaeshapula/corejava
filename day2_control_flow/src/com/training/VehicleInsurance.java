package com.training;

public class VehicleInsurance extends Insurance {
	public int vehicleModel;
	public int yearofManuf;
	public int cost;
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(String policyName, String policyHolderName, int age, int insuranceAmount, int vehicleModel, int yearofManuf,int cost) {
		super(policyName, policyHolderName, age, insuranceAmount);
		this.vehicleModel = vehicleModel;
		this.yearofManuf = yearofManuf;
		this.cost= cost;
		// TODO Auto-generated constructor stub
	}
	
	public int getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearofManuf() {
		return yearofManuf;
	}
	public void setYearofManuf(int yearofManuf) {
		this.yearofManuf = yearofManuf;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public double calcPremium() {
		// TODO Auto-generated method stub
		double premium = 0.0;
		if(this.vehicleModel==2 && this.yearofManuf>2018){
			premium= .5*this.cost;
		}
		else if(this.vehicleModel==2 && this.yearofManuf<2018){
			premium=.6 *this.cost;
		}
		else if(this.vehicleModel==4 && this.yearofManuf>2018){
			premium=.5*this.cost;
		}
		else if(this.vehicleModel==4 && this.yearofManuf<2018){
			premium=.4*this.cost;
		}
		return premium;
	}
	
	
	
}
