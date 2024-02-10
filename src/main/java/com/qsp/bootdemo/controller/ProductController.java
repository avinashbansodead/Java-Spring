package com.qsp.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Product;
import com.example.bootdemo.repository.ProductRepository;


@RestController
public class ProductController
{
@Autowired
ProductRepository pr;

@PostMapping("/saveproductdata")
public String savePro(@RequestBody Product p)
{
	pr.save(p);
	return "Done";
}
@GetMapping("/fetchproductdata")
public Product fetchProductById(@RequestParam int id)
{
	java.util.Optional<Product> p1=pr.findById(id);
	
	Product p=p1.get();
	return p;
}
@GetMapping("/fetchByPriceBetween")
public List<Product> findByPriceBetween(@RequestParam double price1,@RequestParam double price2)
{
	return pr.findByPriceBetween(price1,price2);
}
@GetMapping("/findAllProductbypricelessthan")

public List<Product> fetchProductByPriceLessThan(@RequestParam double price)
{
return pr.findByPriceGreaterThanEqual(price);
	
}
@GetMapping("/fetchbypricegreaterthanequal")
public List<Product> findByPriceGreaterThanEqual(@RequestParam double price)
{
	return pr.findByPriceGreaterThanEqual(price);
}
}
