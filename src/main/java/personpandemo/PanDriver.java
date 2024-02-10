package personpandemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class PanDriver 
{
	public static void main(String[] args) 
	{
		
		ClassPathResource cpr=new ClassPathResource("Person.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Person person=(Person)bfact.getBean("myPerson");
		System.out.println("Person id: "+person.getId());
		System.out.println("Person name: "+person.getName());
		System.out.println("Person address: "+person.getAddress());
		System.out.println("------------------");

		Pan pan= person.getPan();
		System.out.println(pan.getId());
		System.out.println(pan.getPannum());
		System.out.println(pan.getAddress());

  }
}
