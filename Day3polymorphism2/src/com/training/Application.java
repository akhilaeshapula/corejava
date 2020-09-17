package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lawyer rajesh= new Lawyer(494949,"Rajesh Khannan","Highcourt","B.L");
		Musician sharma= new Musician(2323,"Umesh Khanna","Shenoy","Kanpur");
		Billing bill = new Billing();
		bill.printFees(sharma);
		bill.printFees(rajesh);
		
		WrapperAndStatic obj= new WrapperAndStatic();
		obj.parse("1234");
	}
	

}
