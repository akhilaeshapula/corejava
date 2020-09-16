package com.training;

public class Product extends Object{
	//Object is the superclass whereas product is the subclass
	//You can add new variable, new methods and override the ones from superclass
	
	private int productId;
	private double ratePerUnit;
	private String productName;
	private int productType;
	private int quantity;
	private double discount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, double ratePerUnit, String productName, int productType, int quantity) {
		super();
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
		this.productName = productName;
		this.productType = productType;
		this.quantity = quantity;
	}

	public Product(int productId, double ratePerUnit, String productName, int productType, int quantity,
			double discount) {
		super();
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
		this.productName = productName;
		this.productType = productType;
		this.quantity = quantity;
		this.discount = discount;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	// same method name, same or greater visibility, same number of arguments
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		Below line is only to implement the new implementation
		return this.productName +": "+this.ratePerUnit ;
//		when you are overriding you can use the superclass information as well as the present implementation
//		return super.toString()+ this.productName +": "+this.ratePerUnit ;

	}

	
	
}
