package com.myretail.app.dao;
import java.util.List;


import com.myretail.app.model.Product;


public interface ProductDAO {
	 String test();
	 List<Product> findByID(int prodId);
	 List<Product> returnAll();
}
