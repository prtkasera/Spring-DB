package com.cognizant.dao;
import java.util.List;

import com.cognizant.entity.*;
public interface ProductDAO {

	List<Product> getAllProducts();
	List<String> getCategoriesNames();
	boolean insertProduct(Product product);
	boolean checkProduct(Product product);
	//boolean persistProduct(Product product);
	
	
}
