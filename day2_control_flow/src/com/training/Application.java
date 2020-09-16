package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv = new Product(1232,645.21,"LED TV",2);
		ManageProduct mgr = new ManageProduct();
		System.out.println("Discount= " + mgr.calculateDiscount(tv));
		mgr.showProducts();
		System.out.println(mgr.calculateTax(tv));
	}
}
