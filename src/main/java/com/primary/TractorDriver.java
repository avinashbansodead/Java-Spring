package com.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TractorDriver 
{
@Autowired
Vehicle v;
public void m1()
{
	v.start();
}

}
