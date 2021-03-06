package com.training;

//Properties  and Actions
	// or
	// State and Behavior
	// What he has and what he does
	
public class BankAccount {

	// Instance Variable has a default value, its 0 for Long null for string and false for boolean
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		
		return this.balance +=amount; 
	}
	
	public double withdraw(double amount) {
	
		return this.balance-=amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	
	
}
