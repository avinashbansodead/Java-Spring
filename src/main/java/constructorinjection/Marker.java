package constructorinjection;

public class Marker 
{
   @Override
	public String toString() {
		return "Marker [id=" + id + ", colour=" + colour + ", price=" + price + "]";
	}
int id;
   String colour;
   double price;
public Marker(int id, String colour, double price) 
{
	super();
	this.id = id;
	this.colour = colour;
	this.price = price;
}
   
}
