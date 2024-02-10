
package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeDriver1 
{
public static void main(String[] args)
{
	ApplicationContext ac =new AnnotationConfigApplicationContext(Configural.class);
	Life1 life=(Life1) ac.getBean("life1");
	System.out.println(life.id);
	System.out.println(life.alive);
	System.out.println("------");
	Problem1 problem=life.p;
	problem.loveproblem();
}
	
}
