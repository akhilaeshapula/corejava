package com.training.example.two;

import com.training.ifaces.Automobile;

public class ShowroomNew extends Showroom {
	
	@Override
	public Automobile getProduct(int key) {
		if(key ==3){
			return new Tractor();
		}
		else{
			return super.getProduct(key);
		}
	}
	
}
