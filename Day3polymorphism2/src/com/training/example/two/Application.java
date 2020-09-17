package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showroom saiCars = new ShowroomNew();
//		int key = Integer.parseInt(args[0]);
		Scanner sc= new Scanner(System.in);
		int key;
		while(true){
			key =sc.nextInt();
			if(key==0){
				System.exit(0);;
			}
			Automobile selected = saiCars.getProduct(key);
			if (selected == null){
				System.out.println("Wrong option");
			}else{
			saiCars.printEstimate(selected);
			}
		}
	}
	
}
