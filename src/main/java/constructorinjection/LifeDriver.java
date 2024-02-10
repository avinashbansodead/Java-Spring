package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeDriver 
{
public static void main(String[] args)
{
	ApplicationContext ac =new AnnotationConfigApplicationContext(Configural .class);
	Life life=(Life) ac.getBean("life");
	System.out.println(life.id);
	System.out.println(life.alive);
	System.out.println("------");
	Problem problem=life.p;
	problem.loveproblem();
}
	
}
