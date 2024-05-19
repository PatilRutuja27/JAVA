package com.demo.beans;
import java.util.Scanner;
public class AccountService {
	
	public static Account getObj() {
		Account acc=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("1) Saving Account, 2) Current Account, 3) Demate Account");
		int getObjChoice=sc.nextInt();
		
		System.out.println("Enter Name :");
		String Name=sc.next();
		
		System.out.println("Enter Initial Balance :");
		double Balance=sc.nextDouble();
		
		switch(getObjChoice) {
			case 1:
				acc=new SavingAccount(Name,Balance);
				AccountService.setPin(acc);
				break;
			case 2:
				acc=new CurrentAccount(Name,Balance);
				AccountService.setPin(acc);

				break;
			case 3:
				acc=new DemateAccount(Name,Balance);
				break;
			default:
				System.out.println("Wrong Inpute");
				break;
		}
		
		return acc;
		
	}
	
	public static void setPin(Account ac) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ATM PIN :");
		int a=sc.nextInt();
		ac.setPIN(a);
	}
	
	public static int getPin(Account ac) {
		return ac.getPIN();
	}
	
	public static void getService(Account ac) {
		Scanner sc=new Scanner(System.in);

		System.out.println("0) View Details, 1) View Balance, 2) View Intrest Rate, 3) View Intrest");
		if(ac instanceof DemateAccount) {
			System.out.println("4) commission");
		}
		else if(ac instanceof CurrentAccount) {
			System.out.println("4) Number of transaction Limit :");
		}
		
		
		int choice=sc.nextInt();
		switch(choice) {
		case 0:
			System.out.println(ac.toString());
		case 1:
			System.out.println("Balance :"+ac.getBalance());

			break;
		case 2:
			System.out.println("Intrest Rate :"+ac.getIntrestRate());

			break;
		case 3:
			System.out.println("Intrest on your Balance :"+ac.getIntrest());
			break;
		case 4:
			if(ac instanceof DemateAccount) {
				DemateAccount.Commition();
			}
			else if(ac instanceof DemateAccount) {
				CurrentAccount.NumOfTransc();
			}
		default:
			System.out.println("Wrong Inpute");
			break;
	}
	}
	
}
