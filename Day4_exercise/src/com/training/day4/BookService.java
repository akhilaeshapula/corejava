package com.training.day4;

import java.util.NoSuchElementException;

public class BookService {
	Book[] bookArray= new Book[10];
	int i=0;
	boolean flag=false;
	
	public void addBook(Book addbook){
		bookArray[i]= addbook;
		i++;
	
	}
	public Book getOne(int key)throws NoSuchElementException{
		for (int eachelement=0;eachelement<i;eachelement++){
			if(bookArray[eachelement].getBookId()==key){
				return bookArray[eachelement];
			}
		}
		throw new NoSuchElementException();
	}
	 public Book[] getall(){
		 return bookArray;
	 }
	

}
