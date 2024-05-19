package dao;

import beans.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import comparator.MyPriceComparator;
public class ProductDaoImpl implements ProductDao {
static List<Product> plist = new ArrayList<>();
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
		if(pos!=-1) 
		{
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public List<Product> arrangeByPrice() {
		List<Product> lst=new ArrayList<>();
		for(Product p:plist) {
			lst.add(p);
		}
		
		Collections.sort(lst);  
		//plist.);
		return lst;
		
	}

}
