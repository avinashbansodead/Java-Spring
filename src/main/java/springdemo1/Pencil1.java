package springdemo1;

public class Pencil1 
{
int id;
String brand;
double price;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Pencil1 [id=" + id + ", brand=" + brand + ", price=" + price + "]";
}
}
