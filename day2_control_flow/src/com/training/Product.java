package com.training;

public class Product {
	private int productId;
	private double ratePerUnit;
	private String productName;
	private int productType;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, double ratePerUnit, String productName, int productType) {
		super();
		this.productId = productId;
		this.ratePerUnit = ratePerUnit;
		this.productName = productName;
		this.productType = productType;
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
	
	
}
