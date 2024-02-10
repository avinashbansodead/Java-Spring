package constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MarkerDriver
{
    public static void main(String[] args) 
    {
	  ClassPathResource cpr=new ClassPathResource("ConstructorInjection.xml");
	  BeanFactory bfact=new XmlBeanFactory(cpr);
	  Marker marker=(Marker)bfact.getBean("myMarker");
	  System.out.println("Marker Id: "+marker.id);
	  System.out.println("Marker Colour: "+marker.colour);
	  System.out.println("Marker Price:"+marker.price);
	  
	  
	  System.out.println(marker);
	}
}
