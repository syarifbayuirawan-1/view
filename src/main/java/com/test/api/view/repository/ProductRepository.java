package com.test.api.view.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.api.view.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
