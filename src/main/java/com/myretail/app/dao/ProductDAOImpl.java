package com.myretail.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myretail.app.model.Product;

@Component
public class ProductDAOImpl implements ProductDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> findByID(int prodId) {

		String hql = "from products where id="+prodId;
		List<Product> resultSet = sessionFactory.openSession().createQuery(hql).list();
		sessionFactory.close();
		return resultSet;
		// return null;
	}

	@Override
	public List<Product> returnAll() {
		String hql = "from products";
		List<Product> resultSet = sessionFactory.openSession().createQuery(hql).list();
		sessionFactory.close();
		return resultSet;
	}

	@Override
	public String test() {
		return "autowired ok!!!!";
	}

}
