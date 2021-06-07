package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@When("user click on branches button")
	public void user_click_on_branches_button()
	{
		Object[] input6=new Object[1];
		input6[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input6);
	}

	@When("user select {string} as country")
	public void user_select_as_country(String country) 
	{
		Object [] input7=new Object [2];
		input7[0]="lst_countryS";
		input7[1]= country;
		SeleniumOperations.selectById(input7);
	}

	@When("user select {string} as state")
	public void user_select_as_state(String state) 
	{
		Object [] input8=new Object [2];
		input8[0]="lst_stateS";
		input8[1]= state;
		SeleniumOperations.selectById(input8);
	}

	@When("user select {string} as city")
	public void user_select_as_city(String city) 
	{
		Object [] input9=new Object [2];
		input9[0]="lst_cityS";
		input9[1]= city;
		SeleniumOperations.selectById(input9);
	}

	@When("user click on search button")
	public void user_click_on_search_button() 
	{
		Object[] input10=new Object[1];
		input10[0]="//*[@id='btn_search']";
		SeleniumOperations.click(input10);
	}

	@Then("user get branchest at that location")
	public void user_get_branchest_at_that_location() 
	{
		Object [] valsearch=new Object[3];
		valsearch[0]="Search";
		valsearch[1]="//*[@id='DG_bankdetails']/tbody/tr[2]/td/span";
		valsearch[2]="1";
		SeleniumOperations.validate(valsearch);
	}

}
