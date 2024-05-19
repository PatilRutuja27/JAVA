package com.demo.bean;

import java.util.Scanner;


public class DemateAccount extends Account{
	private float IntrestRate=2.6f;

	public DemateAccount() {
		super();
		//System.out.println("Demate Account");

		setIntrestRate(IntrestRate);

	}

	public DemateAccount(String name, double balance) {
		super(name, balance);
		//System.out.println("Demate Account");
		setIntrestRate(IntrestRate);

	}
	
	public static void Commition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of trades :");
		int trades=sc.nextInt();
		
		if(trades<100) {
			System.out.println("commission is "+trades*0.3);
		}
		else {
			System.out.println("commission is "+trades*0.2);
		}
	}
	@Override
	public String toString() {
		//System.out.println("Account is :"+getAccountNum());

		return super.toString()+"DemateAccount [IntrestRate=" + getIntrestRate() + "Intrest ="+getIntrest()+ "]";
	}



}
