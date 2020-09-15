package com.training;

public class Appilcation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DonorDetails donorObj = new DonorDetails();
		donorObj.setBloodGroup("O+");
		donorObj.setDonorName("Varun");
		donorObj.setDonorAge(52);
		DonorDetails donor1Obj = new DonorDetails("Varun","B+",76);
		System.out.println(donor1Obj.getBloodGroup());
		System.out.println(donor1Obj.getDonorAge());
		System.out.println(donor1Obj.getDonorName());

	}

}