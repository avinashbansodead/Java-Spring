
package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class VehicledDriver 
{
public static void main(String[] args) 
{
	ApplicationContext ac=new AnnotationConfigApplicationContext(Congigural1.class);
	
	TractorDriver tractor=(TractorDriver)ac.getBean("tractorDriver");
	tractor.m1();
}
}
