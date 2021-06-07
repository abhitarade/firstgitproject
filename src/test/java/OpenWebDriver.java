import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebDriver 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ABHI\\ST\\selenium\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='25'])[1]")).click();
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='25'])[1]")).click();
		
		
		
		
		
		System.out.println("Program completed");

	}
	
	
}
