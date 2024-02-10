package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyDriver {
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("comp.xml");
		Company company=(Company)ac.getBean("company");
		System.out.println("Id:  "+company.getId());
		System.out.println("Name:"+company.getName());
		System.out.println("No of Employees: "+company.getNoofEmp());

}
}
