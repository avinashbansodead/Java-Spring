package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

	List<Product> findByPriceBetween(double price1, double price2);

	List<Product> findByPriceGreaterThanEqual(double price);

	
	
	
}
