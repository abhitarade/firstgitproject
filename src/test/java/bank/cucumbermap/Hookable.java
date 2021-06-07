package bank.cucumbermap;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{
	@Before
	public void before(Scenario scenario)
	{
		System.out.println(".................................Test Case Start.........................");
	}
	
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println(".................................Test Case End...........................");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		

	}

}
