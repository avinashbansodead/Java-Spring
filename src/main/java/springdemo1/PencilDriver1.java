package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver1 {

	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("Core.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Pencil1 pencil1=(Pencil1)bfact.getBean("myPencil1");
		System.out.println(pencil1);

}
}