package constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Life
{
int id;
boolean alive;
Problem p;

public Life(@Value("1")int id,@Value("true")boolean alive,@Autowired Problem p) {
	
	this.id = id;
	this.alive = alive;
	this.p = p;
}
}
