package beans;

import java.util.Scanner;

public class TestCompany {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Enter customer id");
			int id = sc.nextInt();
			System.out.println("Enter email:");
			String email = sc.next();
			System.out.println("Enter CreditClass");
			String creditClass = sc.next();
			System.out.println("Enter customer type");
			String type = sc.next();
			Customer cs = new Customer(id, email, creditClass, type);
			if(type.equals("individual")) {
				
			}
			break;
		case 2:
			break;
		case 3:
			break;
		}

	}

}
