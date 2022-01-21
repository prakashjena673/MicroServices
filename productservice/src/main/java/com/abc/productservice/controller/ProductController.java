package com.abc.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.productservice.dao.Product;
import com.abc.productservice.service.ProductService;

@RestController
@RequestMapping("/productService")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@GetMapping("/hello")
	public String helloSpringBoot(){
		System.out.println("Hello Spring Boot");
		return "Hello Spring Boot";
		
	}
	
	//To add a new product
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product productReq){
		return productservice.addProduct(productReq);
		
	}
	
	//To get all the products
	@GetMapping("/getAllProduct")
	public List<Product> getAllProducts(){
		return productservice.getAllProducts();
		
	}
	
	//To modify product
	@PutMapping("/modifyProduct/{id}")
	public Product updateProductById(@RequestBody Product product,long id){
		return productservice.updateProductById();
	
		
	}
	

}
