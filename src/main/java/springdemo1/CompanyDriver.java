package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CompanyDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("Core.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Company company=(Company)bfact.getBean("myCompany");
		System.out.println("Company Id: "+company.getId());
		System.out.println("Company Name: "+company.getName());
		System.out.println("No of Employees:"+company.getNoofemp());
   }
}
