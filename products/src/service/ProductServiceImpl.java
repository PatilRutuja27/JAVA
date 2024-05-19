package service;

import dao.ProductDao;
import dao.ProductDaoImpl;
import beans.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	public ProductServiceImpl() {
		this.dao = new ProductDaoImpl();
	}
	@Override
	public boolean addNewProduct() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Pid");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name");
			String nm = sc.next();
			System.out.println("Enter Price");
			int price = sc.nextInt();
			System.out.println("Enter Expiry Date in format (dd/MM/yyyy)");
			String expdt = sc.next();
			LocalDate ldt = LocalDate.parse(expdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			Product p = new Product(pid, nm,price, ldt);
			
			return dao.save(p);
		
		
	}
	@Override
	public List<Product> displayAll() {
		return dao.findAll();
	}
	@Override
	public Product displayById(int pid) {
		return dao.findById(pid);
	}
	@Override
	public List<Product> sortByPrice() {
		return dao.arrangeByPrice();
	} 

}
