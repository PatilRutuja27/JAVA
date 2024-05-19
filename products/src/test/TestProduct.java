package test;
import java.util.List;
import java.util.Scanner;

import beans.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class TestProduct  {
	
    public static void main(String[] args) {
    	ProductService pservice = new ProductServiceImpl();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
    System.out.println("Enetr your choice!");
    System.out.println("1.AddNewProduct \n 2.Display All \n 3.Display by id \n 4.Display in Sorted Order Of Price");
    System.out.println("5.exit");
    choice = sc.nextInt();
    
    switch(choice) {
    case 1: 

		boolean status = pservice.addNewProduct();
		if(status) {
			System.out.println("Added Successfully");
		}
		else {
			System.out.println("Error Occurred");
		}
		break;
    case 2:
    	List<Product> plist = pservice.displayAll();
		plist.stream().forEach(ob->System.out.println(ob));
    	break;
    case 3:
    	System.out.println("Enter Pid");
		int pid = sc.nextInt();
		Product p = pservice.displayById(pid);
		if(p!=null) {
			System.out.println(p);
		}
		else {
			System.out.println("Not Found");
		}
    	break;
    case 4:
    	plist=pservice.sortByPrice();
		plist.stream().forEach(System.out::println);
    	break;
    case 5:
    	break;
    default:
    	System.out.println("invalid");
    	break;
    }
    }while(choice!=5);
    }
   
}
