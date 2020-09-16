package com.training;

public class Insurance {
	private String policyName;
	private String policyHolderName;
	private int age;
	private int insuranceAmount;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(String policyName, String policyHolderName, int age, int insuranceAmount) {
		super();
		this.policyName = policyName;
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.insuranceAmount = insuranceAmount;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(int insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public double calcPremium(){
		double premium;
		if (this.getAge()<25){
			premium= 0.6*this.getInsuranceAmount();
		}else{
			premium= 0.7*this.getInsuranceAmount();

		}
		return premium;
	}

	
}
