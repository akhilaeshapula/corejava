package com.training;

public class ManageProduct {
	// You can take arguments as classes unless they belong to the same package
	public double calculateDiscount(Product prod){
		
		double discount =0.0;
		if(prod.getRatePerUnit()>500 && prod.getRatePerUnit()<=1000){
			discount = 0.10;
		}else if(prod.getRatePerUnit()>1000){
			discount =0.15;
		}
		return discount;	
	}
	public void showProducts(){
		for(int i=0;i<10;i++){
			System.out.println("product");
		}
	}
	public double calculateTax(Product product){
		double tax= 0.0;
		switch(product.getProductType()){
			case 1: return tax = 0.05;
			case 2: return tax =0.1;
			case 3: return tax=0.15;
			default: return tax =0.28;
	}
	}
}
