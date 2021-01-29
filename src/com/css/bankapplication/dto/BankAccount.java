package com.css.bankapplication.dto;

public class BankAccount {
	private static int LastAssignedNo;
	static {
		LastAssignedNo=1000;
	}
	private String accountNo;
	private String accountName;
	private double balance;
	

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = ""+LastAssignedNo++;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount() {
		this.accountNo = ""+LastAssignedNo++;
	}
	public BankAccount(String accountName) {
		super();
		this.accountNo = ""+LastAssignedNo++;
		this.accountName = accountName;
		this.balance = 1000.00;
	}

}
