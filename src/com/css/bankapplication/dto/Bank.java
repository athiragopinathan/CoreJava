package com.css.bankapplication.dto;

import java.util.Arrays;

import com.css.bankapplication.dao.BankServiceProvider;
import com.css.bankapplication.exceptions.InsufficientBalanceException;
import com.css.bankapplication.exceptions.InvalidAccountNoException;

public class Bank implements BankServiceProvider{
	private String IFSCCode;
	private String bankName;
	private BankAccount[] accounts;
	
	

	@Override
	public String toString() {
		return "Bank [IFSCCode=" + IFSCCode + ", bankName=" + bankName + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}
	

	public String getIFSCCode() {
		return IFSCCode;
	}


	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public BankAccount[] getAccounts() {
		return accounts;
	}


	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}


	public Bank(String iFSCCode, String bankName, BankAccount[] accounts) {
		super();
		IFSCCode = iFSCCode;
		this.bankName = bankName;
		this.accounts = accounts;
	}


	public Bank() {
		super();
	}


	@Override
	public BankAccount checkAccount(String accountNo) throws InvalidAccountNoException {
		BankAccount foundAccount=null;
		for(BankAccount account : accounts) {
			if(account.getAccountNo().equals(accountNo)) {
				foundAccount=account;
				break;
			}
		}
		if(foundAccount==null)
			throw new InvalidAccountNoException();
			
		return foundAccount;
	}


	@Override
	public double getBalance(String accountNo) throws InvalidAccountNoException{
		double balance=0.0;
		BankAccount foundAccount=checkAccount(accountNo);
		if(foundAccount!=null) 
			balance=foundAccount.getBalance();
		return balance;
	}


	@Override
	public boolean withdrawMoney(String accountNo, double amount) throws InsufficientBalanceException,InvalidAccountNoException{
		boolean withdrawFlag=false;
		BankAccount foundAccount=checkAccount(accountNo);
		if(foundAccount!=null) 
			if(foundAccount.getBalance()>amount) {
				foundAccount.setBalance(foundAccount.getBalance()-amount);
			}
		return withdrawFlag;
	}


	@Override
	public boolean depositMoney(String accountNo, double amount) throws InvalidAccountNoException{
		boolean depositFlag=false;
		BankAccount foundAccount=checkAccount(accountNo);
		if(foundAccount!=null) {
			foundAccount.setBalance(foundAccount.getBalance()+amount);
			depositFlag=true;
		}
		return depositFlag;
	}


	@Override
	public boolean transferMoney(String fromAccountNo, String toAccountNo, double amount) throws InvalidAccountNoException,InsufficientBalanceException{
		boolean transferFlag=false;
		boolean depositFlag=false;
		boolean withdrawFlag=withdrawMoney(fromAccountNo, amount);
		if(withdrawFlag)
			depositFlag=depositMoney(toAccountNo, amount);
		if(depositFlag)
			transferFlag=true;
		else
			depositMoney(fromAccountNo, amount);
		return transferFlag;
	}

	

}
