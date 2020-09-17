package com.training.ifaces;

public interface Automobile {
//	The following attribute is of type Public static final by default
//	 We are writing in upper case because its a constant
	String APPNAME= "Quotation Generation System";
//	In an interface all methods are abstract, all three methods are public and abstract by default
//	To understand that we have added the same in different methods
	
	public abstract String getColor();
	public String getModel();
	double getPrice();
}
