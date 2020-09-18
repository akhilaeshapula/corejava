package com.training.day4.exceptions;

public class MycustomException extends Exception {

	private String string;
	private String throwable;
	public MycustomException(String string,String throwable) {
		super();
		this.string= string;
		this.throwable =throwable;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getThrowable() {
		return throwable;
	}
	public void setThrowable(String throwable) {
		this.throwable = throwable;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return string + throwable;
	}
	
	
}
