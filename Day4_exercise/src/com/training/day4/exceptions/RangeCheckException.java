package com.training.day4.exceptions;


public class RangeCheckException extends Exception {

	private String message;

	public RangeCheckException(String message) {
		super();
		this.message = message;
	}
	

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		return "Exception+"+message;
	}
	
		
	}

