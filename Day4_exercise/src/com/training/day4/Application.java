package com.training.day4;

import com.training.day4.exceptions.MycustomException;

public class Application {

public static void main(String[]args){
	
	try{
		Book maths= new Book();
		Book science=new Book("","Verma",2435,400);
		maths.setBookName("R.S.Agarwal");
		maths.setBookId(2012);
		maths.setPrice(250);
		maths.setAuthor("Agarwal");		
		BookService service=new BookService();
		service.addBook(maths);
		service.addBook(science);
		System.out.println(service.getOne(2435));
		System.out.println(service.getall());
	}catch(MycustomException e){
		System.out.println(e.getMessage());
		}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
	
}
