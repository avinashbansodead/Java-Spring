package mobilesimdemo;

public class Sim 
{
	int id;
	String network;
	String type;
	public void simDetails()
	{
		System.out.println(id);
		System.out.println(network);
		System.out.println(type);
	}
	public Sim(int id, String network, String type) 
	{
		super();
		this.id = id;
		this.network = network;
		this.type = type;
	}
	
	

}
