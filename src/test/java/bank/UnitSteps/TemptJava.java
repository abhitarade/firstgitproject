package bank.UnitSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ABHI\\ST\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@src='images/login.jpg']")).click();
		
		driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();
		Select selcountry=new Select(driver.findElement(By.id("lst_countryS")));
		selcountry.selectByVisibleText("INDIA");
		Select selstate=new Select(driver.findElement(By.id("lst_stateS")));
		selstate.selectByVisibleText("MAHARASTRA");
		Select selcity=new Select(driver.findElement(By.id("lst_cityS")));
		selcity.selectByVisibleText("MUMBAI");
		
		driver.findElement(By.id("btn_search")).click();
		
		

	}

} 
