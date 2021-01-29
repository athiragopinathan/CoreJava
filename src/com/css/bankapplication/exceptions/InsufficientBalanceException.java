package com.css.bankapplication.exceptions;

public class InsufficientBalanceException extends Exception{
	private String errorMsg= "Insufficient balance in account.";
	
	public InsufficientBalanceException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public InsufficientBalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.errorMsg;
	}
	
	
}
