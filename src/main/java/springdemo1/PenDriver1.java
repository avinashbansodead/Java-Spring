package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver1
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("Core.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Pen1 pen1=(Pen1)bfact.getBean("myPen1");
		System.out.println(pen1);
		
}
}