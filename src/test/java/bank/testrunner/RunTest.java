package bank.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions
		(
				plugin="pretty",
				features="src/test/resources/BUSINESS_LOGIC",
				tags="@SmokeTest",
				glue="bank.cucumbermap",
				monochrome=true
				
		)






public class RunTest 
{

	

}
