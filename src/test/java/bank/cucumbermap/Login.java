package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	
		
		@When("user opens {string} browser")
		public void user_opens_browser(String bn)
		{
			Object[] input1=new Object[1];
			input1[0]=bn;
			SeleniumOperations.browserLaunch(input1); 
				
		}

		@When("user opens {string} link")
		public void user_opens_link(String lnk)
		{
			Object[] input2=new Object[1];
			input2[0]=lnk;
			SeleniumOperations.openUrl(input2);

		}

		@When("user enters {string} as username")
		public void user_enters_as_username(String unm)
		{
			Object[] input3=new Object[2];
			input3[0]="//*[@name='txtuId']";
			input3[1]=unm;
			SeleniumOperations.sendKeys(input3);

		}

		@When("user Enters {string} as password")
		public void user_enters_as_password(String pw)
		{
			Object[] input4=new Object[2];
			input4[0]="//*[@name='txtPword']";
			input4[1]=pw;
			SeleniumOperations.sendKeys(input4);

		}

		@When("user click on login button")
		public void user_click_on_login_button() 
		{
			Object[] input5=new Object[1];
			input5[0]="//*[@src='images/login.jpg']";
			SeleniumOperations.click(input5);			
		}

		@Then("user will move on Admin page for validating {string} functionality")
		public void validating(String testcase)
		{
			Object [] valid=new Object[3];
			valid[0]=testcase;
			valid[1]="//*[@size='3']";
			valid[2]="Welcome to Admin";
			SeleniumOperations.validate(valid);
			
		}


}
