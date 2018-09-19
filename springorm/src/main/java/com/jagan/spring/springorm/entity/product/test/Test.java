package com.jagan.spring.springorm.entity.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jagan.spring.springorm.entity.product.dao.ProductDao;
import com.jagan.spring.springorm.entity.product.dao.impl.ProductDaoImpl;
import com.jagan.spring.springorm.product.entity.Product;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springorm/entity/product/test/config.xml");
	
	ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
	Product product = new Product();
	product.setId(1);
	product.setName("XBox");
	product.setDesc("Gaming Console");
	product.setPrice(25488.99);
	int result = productDao.create(product);
	
	System.out.println("Data is inserted into database : " + result);
}
}
