package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("comp.xml");
		Car car=(Car)ac.getBean("car");
		
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getPrice());
		System.out.println(car.getMillege());
		System.out.println();
		
		Engine engine=car.getE();
		engine.start();

}
}
