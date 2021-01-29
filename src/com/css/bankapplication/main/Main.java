package com.css.bankapplication.main;

import com.css.bankapplication.dto.Bank;
import com.css.bankapplication.dto.BankAccount;
import com.css.bankapplication.exceptions.InsufficientBalanceException;
import com.css.bankapplication.exceptions.InvalidAccountNoException;
public class Main {
	
	public static void main(String[] args) {
		BankAccount[] accounts=new BankAccount[3];
		accounts[0]=new BankAccount("Athira");
		accounts[1]=new BankAccount("Aarcha");
		accounts[2]=new BankAccount("Jwala");
		
		Bank sbiBank=new Bank("SBI1111","Kochi",accounts);
		BankAccount foundAccount=null;
		double balance=0.0;
		try {
			balance=sbiBank.getBalance("1000");
			sbiBank.depositMoney("1000", 5000.00);
			sbiBank.withdrawMoney("1001", 600.00);
			sbiBank.transferMoney("1000","1002",5000.00);
			
		} catch (InvalidAccountNoException | InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(sbiBank.getBalance("1000"));
			System.out.println(sbiBank.getBalance("1001"));
			System.out.println(sbiBank.getBalance("1002"));
			System.out.println(sbiBank.getBalance("1000"));
	
		} catch(InvalidAccountNoException e) {
			e.printStackTrace();
		}
	}

}
