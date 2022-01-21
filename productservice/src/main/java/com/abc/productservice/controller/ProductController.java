package com.abc.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//get product by Id
	@GetMapping("/getProduct/{id}")
	public Optional<Product> getProductById(@PathVariable long id){
		return productservice.getProductById(id);
		
	}
	
	//To modify product
	@PutMapping("/modifyProduct/{id}")
	public Product updateProductById(@RequestBody Product product,@PathVariable long id){
		return productservice.updateProductById(product,id);
	
		
	}
	//to delete product by id
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProductById(@PathVariable long id){
		productservice.deleteProductById(id);
		return "Product Deleted Succesfully!!";
		
	}
	

}
