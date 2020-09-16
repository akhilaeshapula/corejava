package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv = new Product(1232,645.21,"LED TV",2,5000);
		ManageProduct mgr = new ManageProduct();
		//System.out.println("Discount= " + mgr.calculateDiscount(tv));
		//mgr.showProducts();
		System.out.println(mgr.calculateTax(tv));
		Product fridge= new Product();
		fridge.setProductId(200);
		fridge.setProductName("fridge");
		fridge.setRatePerUnit(1029);
		fridge.setQuantity(800);
		//we are placing two elements at the place 0 and 1 
		//the whole fridge and tv descriptions are considered as one-one unit in the array(this is not multidimensional)
		Product[] productList= new Product[2];
		productList[0]= tv;
		productList[1]=fridge;
		//you can also just initialise it as :
		//Product[] productList={tv,fridge};
		mgr.showProductForEach(productList);
		mgr.showProductsLegacy(productList);
		productList= mgr.calculateAmount(productList);
		for(int i=0;i<productList.length;i++){
			System.out.println(productList[i].getProductName()+ " : "+
		mgr.calcDisc(productList[i]));
		}
		
	}
}
