package com.training.example.three;
import com.training.ifaces.Automobile;
import com.training.ifaces.Rental;
public class Application {
	public static void main(String[]args){
		Shop saiRents= new Shop();
		int key = Integer.parseInt(args[0]);
		Rental selected = saiRents.getDetails(key);
		if (selected == null){
			System.out.println("Wrong option");
		}else{
		saiRents.calcRent(selected);
		}
	}
}
