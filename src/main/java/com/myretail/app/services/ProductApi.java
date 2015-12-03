package com.myretail.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myretail.app.dao.ProductDAOImpl;
import com.myretail.app.model.Product;
import com.myretail.app.services.response.ProductApiResponse;

@Controller
@RequestMapping("/api/Product/")
public class ProductApi {
	@Autowired
	ProductDAOImpl pd;
	@Autowired
	ProductApiResponse response;  

	/*url example: http://localhost:8080/app/api/Product/getProductByID?id=1*/	
	
	@RequestMapping(value = "/getProductByID", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public ProductApiResponse getProductById(@RequestParam("id") int id) {
		response.setProducts(pd.findByID(id));
		return response ;
	}

	/*url example: http://localhost:8080/app/api/Product/getProducts*/	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public ProductApiResponse getAllProduct() {
		response.setProducts(pd.returnAll());
		return response;
	}

}
