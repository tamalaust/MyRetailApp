package com.myretail.app.services.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.myretail.app.model.Product;

@Component
public class ProductApiResponse {
	private List<Product> products;

	public ProductApiResponse(){
		
	}
	public ProductApiResponse(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	

}
