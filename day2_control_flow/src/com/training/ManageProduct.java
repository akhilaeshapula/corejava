package com.training;

public class ManageProduct {
	// You can take arguments as classes unless they belong to the same package
	public Product[] calculateAmount(Product[] productList){
		double discount =0.0;
		for (int eachProduct=0; eachProduct<productList.length;eachProduct++){
			if(productList[eachProduct].getRatePerUnit()>500 &&productList[eachProduct].getRatePerUnit()<=1000){
				discount=0.10;
			}
			else if(productList[eachProduct].getRatePerUnit()>1000){
				discount=0.15;
			}
			productList[eachProduct].setDiscount(discount);
		}
		return productList;
				
	}
	public void showProductsLegacy(Product[]productList){
		for(int i=0;i<productList.length;i++){
//			System.out.println("product"+"=>"+productList[i].getProductName());
			System.out.println(productList[i]);

		}
	}
	public void showProductForEach(Product[] productList){
		for (Product eachProduct: productList){
			System.out.println(eachProduct.getProductName()+"."+eachProduct.getRatePerUnit());
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
	public double calcDisc(Product product){
		double amount= product.getRatePerUnit()-(product.getDiscount()*product.getRatePerUnit());
		amount= amount* product.getQuantity();
		return amount;
		
	}

}
