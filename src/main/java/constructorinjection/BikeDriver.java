package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeDriver
{
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(Configural.class);
	Bike bike=(Bike)ac.getBean("bike");
	bike.start();
	
}
}
