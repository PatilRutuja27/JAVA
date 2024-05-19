package com.demo.test;
import com.demo.service.*;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService obj=new StudentService();

		int choice;
		
		do {
			
			System.out.println("1. to add  2. display  3. find by id");
			System.out.println("4. find by name  5. delete by id  3. find by id");
			System.out.println("\nChoice :");
			
			choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println( obj.addStudent());
				break;
			case 2:
				System.out.println( obj.displayData());
				break;
			case 3:
				System.out.println( obj.findById());
				break;
			case 4:
				obj.findByName();
				break;
			case 5:
				System.out.println( obj.deleteById());
				break;
			case 6:
				break;
		}
		}while(choice!=0);
	
	}

}
