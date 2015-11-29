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

@Controller
@RequestMapping("/api/Product/")
public class ProductApi {
	@Autowired
	ProductDAOImpl pd;

	/*url example: http://localhost:8080/app/api/Product/getProductByID?id=1*/	
	
	@RequestMapping(value = "/getProductByID", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public Product getProductById(@RequestParam("id") int id) {

		return pd.findByID(id);
	}

	/*url example: http://localhost:8080/app/api/Product/getProducts*/	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<Product> getAllProduct() {
		List<Product> result=pd.returnAll();
		return result;
	}

}
