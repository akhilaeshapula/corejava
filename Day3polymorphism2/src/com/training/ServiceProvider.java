package com.training;

public abstract class ServiceProvider {
	private long phoneNumer;
	private String firstName;
	
	
	public ServiceProvider(long phoneNumer, String firstName) {
		super();
		this.phoneNumer = phoneNumer;
		this.firstName = firstName;
	}


	public long getPhoneNumer() {
		return phoneNumer;
	}


	public void setPhoneNumer(long phoneNumer) {
		this.phoneNumer = phoneNumer;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public abstract double calculateFees();
	
}
