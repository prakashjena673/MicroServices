package com.abc.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.productservice.dao.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
