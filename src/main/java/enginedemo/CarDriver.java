package enginedemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver 
{
public static void main(String[] args) {
	


	ClassPathResource cpr=new ClassPathResource("Engine1.xml");
	BeanFactory bfact=new XmlBeanFactory(cpr);
    Car c=(Car)bfact.getBean("myCar");
    System.out.println("Car id: "+c.getId());
    System.out.println("Car Brand: "+c.getBrand());
    System.out.println("Car Price: "+c.getPrice());
    System.out.println("------------------");
    
       Engine e= c.getE();
       System.out.println(e.getId());
       System.out.println(e.getCc());
	
}
}
