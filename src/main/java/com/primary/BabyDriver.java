package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class BabyDriver 
{
public static void main(String[] args) 
{
	ApplicationContext ac=new AnnotationConfigApplicationContext(Congigural1.class);
	Baby b=(Baby)ac.getBean("baby");
	b.m1();
}
}
