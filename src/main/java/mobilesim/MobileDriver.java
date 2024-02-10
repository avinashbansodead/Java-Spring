package mobilesim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("comp.xml");
		Mobile mobile=(Mobile)ac.getBean("mobile");
		
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getModel());
		System.out.println(mobile.getPrice());
		System.out.println();
		
		Sim sim=mobile.getSim();
		sim.start();

}
}



