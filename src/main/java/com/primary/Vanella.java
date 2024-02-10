package com.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vanella implements Icecream
{
public void eat()
{
	System.out.println("Baby is eating Vanella");
}
}
