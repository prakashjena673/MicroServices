package com.abc.productservice.service;

import java.util.List;
import java.util.Optional;

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

	public Product updateProductById(Product product, long id) {
		Optional<Product> productresp = productrepo.findById(id);
		Product productobj = new Product();

		if (productresp.isPresent()) {
			productobj.setProductname(product.getProductname());
			productobj.setProductcatagory(product.getProductcatagory());
			productobj.setProductprice(product.getProductprice());
			productobj.setProductstatus(product.getProductstatus());
			productrepo.save(productobj);
		}
		return productobj;

	}

	public void deleteProductById(long id) {
		productrepo.deleteById(id);
		
	}

	public Optional<Product> getProductById(long id) {
		return productrepo.findById(id);
	}
	
	

}
