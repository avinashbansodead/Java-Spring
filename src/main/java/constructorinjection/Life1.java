package constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Life1 
{
	@Value("1")
int id;
	@Value("true")
boolean alive;
	@Autowired	
	Problem1 p;



}
