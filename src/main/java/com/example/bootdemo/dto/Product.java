package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product
{
@Id
private int id;
private String name;
private String company;
private String brand;
private double price;
public int getId() {
	return id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
