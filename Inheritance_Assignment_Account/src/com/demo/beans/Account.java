package com.demo.beans;    

public class Account implements IATM{
	private int AccountNum;
	private String Name;
	private double Balance;
	private float IntrestRate;
	static int num=101;

	public Account() {
		super();
		System.out.println("Base Account");

	}

	public Account(String name, double balance) {
		super();
		AccountNum = num++;
		Name = name;
		Balance = balance;
		    
		System.out.println("Base Account");

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return Balance;
	}
	

	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getAccountNum() {
		return AccountNum;
	}

	public void setAccountNum() {
		AccountNum = num++;
	}
	
	public float getIntrestRate() {
		return IntrestRate;
	}

	public void setIntrestRate(float intrestRate) {
		IntrestRate = intrestRate;
	}
	

	
	
	public double getIntrest() {
		double intrest=getBalance()*getIntrestRate()/100;
		System.out.println("getBalance() ="+getBalance()+" getIntrestRate()="+getIntrestRate()+" intrest ="+intrest);
		return intrest;
	}
	

	@Override
	public String toString() {
		return "Account [AccountNum=" + AccountNum + ", Name=" + Name + ", Balance=" + Balance + "]";
	}

	@Override
	public void setPIN(int pin) {
		
	}

	@Override
	public int getPIN() {
		return 0;
	}
   	
}
