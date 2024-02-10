package constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Bike 
{
public Bike()
{
	System.out.println("Constructor is invoked");
}
public void start()
{
	System.out.println("Bike has started");
}
}

