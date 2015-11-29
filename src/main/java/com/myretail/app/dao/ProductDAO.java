package com.myretail.app.dao;
import java.util.List;


import com.myretail.app.model.Product;


public interface ProductDAO {
	 String test();
	 Product findByID(int prodId);
	 List<Product> returnAll();
}
