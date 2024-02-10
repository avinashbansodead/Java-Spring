package setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car 
{
	
private int id;
private String brand;
private double price;
private int millege;
private Engine e;

public int getId() {
	return id;
}
@Value("1")
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
@Value("Mahindra")
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
@Value("250000")
public void setPrice(double price) {
	this.price = price;
}
public int getMillege() {
	return millege;
}
@Value("2500")
public void setMillege(int millege) {
	this.millege = millege;
}
public Engine getE() {
	return e;
}
@Autowired
public void setE(Engine e) {
	this.e = e;
}


}
