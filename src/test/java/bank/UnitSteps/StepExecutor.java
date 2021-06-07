package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) 
	{
		//browserLaunch
				Object[] input1=new Object[1];
				input1[0]="Chrome";
				SeleniumOperations.browserLaunch(input1);
				
		//openUrl
				Object[] input2=new Object[1];
				input2[0]="http://primusbank.qedgetech.com/";
				SeleniumOperations.openUrl(input2);
				
		//sendKeys
				Object[] input3=new Object[2];
				input3[0]="//*[@name='txtuId']";
				input3[1]="Admin";
				SeleniumOperations.sendKeys(input3);
				
		//sendKeys
				Object[] input4=new Object[2];
				input4[0]="//*[@name='txtPword']";
				input4[1]="Admin";
				SeleniumOperations.sendKeys(input4);
				
		//click
				Object[] input5=new Object[1];
				input5[0]="//*[@src='images/login.jpg']";
				SeleniumOperations.click(input5);
				
		// validate login
				Object [] valid=new Object[3];
				valid[0]="Login";
				valid[1]="//*[@size='3']";
				valid[2]="Welcome to Admin";
				SeleniumOperations.validate(valid);
				
		//click
				Object[] input6=new Object[1];
				input6[0]="//*[@src='images/Branches_but.jpg']";
				SeleniumOperations.click(input6);
				
		//selectById
				Object [] input7=new Object [2];
				input7[0]="lst_countryS";
				input7[1]= "INDIA";
				SeleniumOperations.selectById(input7);
				
		//selectById
				Object [] input8=new Object [2];
				input8[0]="lst_stateS";
				input8[1]= "GOA";
				SeleniumOperations.selectById(input8);
				
		//selectById("lst_cityS", "GOA");
				Object [] input9=new Object [2];
				input9[0]="lst_cityS";
				input9[1]= "GOA";
				SeleniumOperations.selectById(input9);
				
		//click
				Object[] input10=new Object[1];
				input10[0]="//*[@id='btn_search']";
				SeleniumOperations.click(input10);
				
		//validate search
				Object [] valsearch=new Object[3];
				valsearch[0]="Search";
				valsearch[1]="//*[@id='DG_bankdetails']/tbody/tr[2]/td/span";
				valsearch[2]="1";
				SeleniumOperations.validate(valsearch);
				
		
	}

}
