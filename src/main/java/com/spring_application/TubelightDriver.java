package com.spring_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TubelightDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("app.xml");
		Tubelight tubelight=(Tubelight)ac.getBean("tubelight");
		tubelight.work();
	}

}
