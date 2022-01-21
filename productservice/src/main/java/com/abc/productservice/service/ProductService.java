package com.abc.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.productservice.dao.Product;
import com.abc.productservice.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productrepo;

	public Product addProduct(Product productReq) {
		return productrepo.save(productReq);
	}

	public List<Product> getAllProducts() {
		return productrepo.findAll();
	}

	public Product updateProductById() {
		//productrepo.getById(id);
		
		return null;	
	}


}
