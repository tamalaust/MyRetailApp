package com.myretail.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "product_price")
public class ProductPrice implements Serializable{
	private static final long serialVersionUID = 1L;

	private int product_price_cat_id;
	private double pc_unit_price;

	public ProductPrice() {
	}

	@Id
	@GeneratedValue
	public int getProduct_price_cat_id() {
		return product_price_cat_id;
	}

	public void setProduct_price_cat_id(int product_price_cat_id) {
		this.product_price_cat_id = product_price_cat_id;
	}

	public double getPc_unit_price() {
		return pc_unit_price;
	}

	public void setPc_unit_price(double pc_unit_price) {
		this.pc_unit_price = pc_unit_price;
	}
	
	@Override
	public String toString() {
		return  String.valueOf(this.product_price_cat_id) ;
	}
}
