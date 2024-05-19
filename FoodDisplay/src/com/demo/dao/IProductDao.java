package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface IProductDao {
	boolean save(Product p);

	List<Product> findAll();

	Product findById(int pid);

	List<Product> findByName(String nm);

	List<Product> findByPrice(float price);

	boolean deleteById(int id);

	boolean updateById(int pid, int qty, float price);


}
