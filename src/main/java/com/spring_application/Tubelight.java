package com.spring_application;

import org.springframework.stereotype.Component;

@Component
public class Tubelight 
{
	public Tubelight()
	{
		System.out.println("Constructor is invoked and object created");
	}
public void work()
{
	System.out.println("Tubelight is working well");
}
}
