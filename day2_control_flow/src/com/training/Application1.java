package com.training;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance ins= new Insurance("sghd","Ramesh",50,2000);
		System.out.println(ins.calcPremium());
		VehicleInsurance ins2= new VehicleInsurance("gus","Ramesh",24,30000,2,4,40000);
		System.out.println(ins2.calcPremium());

	}

}

