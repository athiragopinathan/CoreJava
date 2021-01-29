package com.css.bankapplication.dao;

import com.css.bankapplication.dto.BankAccount;
import com.css.bankapplication.exceptions.InsufficientBalanceException;
import com.css.bankapplication.exceptions.InvalidAccountNoException;

public interface BankServiceProvider {
	public BankAccount checkAccount(String accountNo)throws InvalidAccountNoException;
	public double getBalance(String accountNo) throws InvalidAccountNoException;
	public boolean withdrawMoney(String accountNo, double amount) throws InsufficientBalanceException,InvalidAccountNoException;
	public boolean depositMoney(String accountNo, double amount) throws InvalidAccountNoException;
	public boolean transferMoney(String fromaccountNo, String toAccountNo,double amount) throws InvalidAccountNoException, InsufficientBalanceException;
}
