package com.jagan.spring.springorm.entity.product.dao;

import com.jagan.spring.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	
	void update(Product product);
}
