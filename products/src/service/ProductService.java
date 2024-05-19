package service;

import java.util.List;

import beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	Product displayById(int pid);

	List<Product> sortByPrice();

}
