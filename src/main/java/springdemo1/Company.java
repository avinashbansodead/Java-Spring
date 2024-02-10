package springdemo1;

public class Company 
{
	int id;
	String name;
	String noofemp;
	public int getId() {
		return id;
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
	public String getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(String noofemp) {
		this.noofemp = noofemp;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", noOfEmp=" + noofemp + "]";
}

}
