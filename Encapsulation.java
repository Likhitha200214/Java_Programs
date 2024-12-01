package com.jspiders.encapsulation;

public class Account {
	private long accountNumber;
	private double accountBalance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Person p=new Person();
				p.setAge(18);
				p.setAadhar(123412341234L);
				System.out.println("Age: "+p.getAge());
				System.out.println("aadhar :"+p.getAadhar());
	}
}	
