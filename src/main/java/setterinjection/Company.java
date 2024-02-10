package setterinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company 
{
	private int id;
	private String name;
	private int noofEmp;
	
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
	@Value("wipro")
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofEmp() {
		return noofEmp;
	}
	@Value("10000")
	public void setNoofEmp(int noofEmp) {
		this.noofEmp = noofEmp;
	}

}
