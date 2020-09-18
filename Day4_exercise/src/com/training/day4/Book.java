package com.training.day4;


import com.training.day4.exceptions.MycustomException;
import com.training.day4.exceptions.RangeCheckException;

public class Book {
	private String bookName;
	private String author;
	private int bookId;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String author, int bookId, double price) throws Exception{
		super();
		if (bookName==null){
			throw new NullPointerException();
		}
		this.bookName = bookName;
		this.author = author;
		this.bookId = bookId;
		if(price<100 || price>500){
			throw new RangeCheckException("Unexpected price range");
		}else{
		this.price = price;}
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName)throws MycustomException{
		try{
			if(bookName==null){
		
			throw new NullPointerException();}
		}catch(NullPointerException e){
			throw new MycustomException("Book name should not be empty", e.getMessage());
		}
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price)throws RangeCheckException {
		if(price<100 || price>500){
			throw new RangeCheckException("Unexpected price range");
		}
		this.price = price;
	}

	
	
	
	

}
