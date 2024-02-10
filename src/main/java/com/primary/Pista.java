package com.primary;

import org.springframework.stereotype.Component;

@Component
public class Pista implements Icecream 
{
public void eat()
{
	System.out.println("Baby is eating Pista");
}
}
