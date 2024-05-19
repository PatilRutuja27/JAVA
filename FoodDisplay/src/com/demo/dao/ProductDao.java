package com.demo.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;

import com.demo.bean.Product;

public class ProductDao implements IProductDao {
	static List<Product> plist;
	static {
		plist = new ArrayList<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
	}
	@Override
	public boolean save(Product p) {
		return plist.add(p);
	}
	@Override
	public List<Product> findAll() {
		
		return plist;
	}
	@Override
	public Product findById(int pid) {
		int pos = plist.indexOf(new Product(pid));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public List<Product> findByName(String nm) {
		
		List<Product> lst = plist.stream()
				.filter(ob->ob.getPname().equals(nm))
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}
	@Override
	public List<Product> findByPrice(float price) {
		 
		List<Product>lst = plist.stream()
				.filter(ob->ob.getPrice()>price)
				.collect(Collectors.toList());
	     if(lst.isEmpty()) {
	    	 return null;
	     }
	         return lst;
				
	}
	@Override
	public boolean deleteById(int id) {
		return plist.remove(new Product(id));
		
	}
	@Override
	public boolean updateById(int pid, int qty, float price) {
		plist.sort(null);
		Product p = findById(pid);
		if(p!=null) {
			p.setQty(qty);
			p.setPrice(price);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
