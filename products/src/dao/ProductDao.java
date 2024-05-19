package dao;

import java.util.List;

import beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAll();

	Product findById(int pid);

	List<Product> arrangeByPrice();

}
