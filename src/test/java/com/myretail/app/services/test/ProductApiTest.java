package com.myretail.app.services.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jayway.jsonpath.JsonPath;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

//using restassured test framework

public class ProductApiTest {
	
	/*testing single product*/
	@Test
	public void getProductByID() {
		expect().
			body("products[0].id", equalTo(1)).
			body("products[0].prod_sku", equalTo("AEX143")).
			body("products[0].prod_name", equalTo("Stroller")).
		when().
			get("http://localhost:8080/app/api/Product/getProductByID?id=1");
	}
	
	/*testing  products list but total number of products*/
	@Test
	public void getProducts(){
		String response = get("http://localhost:8080/app/api/Product/getProducts").asString();
		int numberOfTotalProducts = JsonPath.parse(response).read("$.products.length()");
		assertEquals(3, numberOfTotalProducts);
		
		
	}
	
	

}
