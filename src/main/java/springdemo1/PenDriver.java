package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("Core.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Pen pen =(Pen)bfact.getBean("mypen");
		pen.write();
	}


}
