package mobilesim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
private int id;
private String name;
private String model;;
private double price;
private Sim sim;
public int getId() {
	return id;
}
@Value("1")
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@Value("Moto")
public void setName(String name) {
	this.name = name;
}
public String getModel() {
	return model;
}
@Value("e40")
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
@Value("10000")
public void setPrice(double price) {
	this.price = price;
}
public Sim getSim() {
	return sim;
}
@Autowired
public void setSim(Sim sim) {
	this.sim = sim;
}

}
