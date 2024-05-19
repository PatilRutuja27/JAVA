package com.demo.bean;

import com.demo.doa.IATM;

public class CurrentAccount extends Account implements IATM {
private int PIN;
	
	public CurrentAccount() {
		super();
		setIntrestRate(1.6f);
		System.out.println("Current Account");

	}

	public CurrentAccount(String name, double balance,int pin) {
		super(name, balance);
		setIntrestRate(1.6f);
		PIN=pin;
		System.out.println("Current Account");


		// TODO Auto-generated constructor stub
	}

	public static void NumOfTransc() {
		System.out.println("Transaction limit : 2,00,000");
	}
	
	
	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	@Override
	public String toString() {
		//System.out.println("Account is :"+getAccountNum());

		return super.toString()+"CurrentAccount [IntrestRate=" + getIntrestRate() + "Intrest ="+getIntrest()+ "]";
	}

}
