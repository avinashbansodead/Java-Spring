package mobilesimdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver 
{
    public static void main(String[] args) 
    {
	   ClassPathResource cpr = new ClassPathResource("mob.xml");
	   BeanFactory bfact = new XmlBeanFactory(cpr);
	   Mobile mobile = (Mobile) bfact.getBean("myMobile");
	   System.out.println(mobile);
	   
	   Sim sim = mobile.s ;
	   sim.simDetails();
	}
}
   