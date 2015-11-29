package com.myretail.app.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String prod_sku;
	private String prod_name;
	private String prod_category;
	@Transient
	private Date updated_date;

	private ProductPrice pPriceCat;

	public Product() {
	}

	public String getProd_sku() {
		return prod_sku;
	}

	public void setProd_sku(String prod_sku) {
		this.prod_sku = prod_sku;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_category() {
		return prod_category;
	}

	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public int getProd_price_cat_id() { return prod_price_cat_id; }
	 * 
	 * public void setProd_price_cat_id(int prod_price_cat_id) {
	 * this.prod_price_cat_id = prod_price_cat_id; }
	 */

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // one to to
																	// one thats
																	// why using
																	// eager
	@JoinColumn(name = "prod_price_cat_id")
	public ProductPrice getpPriceCat() {
		return pPriceCat;
	}

	public void setpPriceCat(ProductPrice pPriceCat) {
		this.pPriceCat = pPriceCat;
	}

	@Override
	public String toString() {
		return this.prod_name;
	}

}
