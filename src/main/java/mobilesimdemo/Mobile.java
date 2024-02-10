package mobilesimdemo;

public class Mobile 
{
	int id;
	String brand;
	String model;
	double price;
	Sim s;
	public Mobile(int id, String brand, String model, double price, Sim s) 
	{
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
