package com.css.bankapplication.exceptions;

public class InvalidAccountNoException extends Exception{
	private String errorMsg= "Bank Account is invalid.";
	
	public InvalidAccountNoException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public InvalidAccountNoException() {
		super();
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.errorMsg;
	}
	
	
}
