package bank.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations
{

	public static WebDriver driver=null;	
	public static void main(String[] args) throws InterruptedException 
	{
		
	} 
	
	//validate test case
	
	public static void validate(Object [] val)
	{
		
		try {
		
		String ltc=(String)val[0];
		String xpath=(String)val[1];
		String match=(String) val[2];
		String text=driver.findElement(By.xpath(xpath)).getText();
		if(text.equalsIgnoreCase(match))
		{
			System.out.println(ltc + " Test case is passed");
		}
		
		else {System.out.println(ltc + " Test case is failed");}
		} catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	//select by xpath
	
		public static void selectByXpath(Object[] xp_text)
		{
		
			
			
			try {
			String xp=(String)xp_text[0];
			Object seltext=(Object)xp_text[1];
			
			WebElement we=driver.findElement(By.xpath(xp));
			
			Select se=new Select(we);
			se.selectByVisibleText((String) seltext);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	
	
	
	//select by ID
	
	public static void selectById(Object[] id_text)
	{
		
		
		try {
		String idp=(String)id_text[0];
		Object seltext=(Object)id_text[1];
		WebElement we=driver.findElement(By.id(idp));
		
		Select se=new Select(we);
		se.selectByVisibleText((String) seltext);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	//click
	
	public static void click(Object []element)
	{
		
		
		try {
		String ele=(String)element[0];
		driver.findElement(By.xpath(ele)).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//sendKeys
	public static void sendKeys(Object[] xpath_value)
	{
		
		
		try {
		String xpath1=(String)xpath_value[0];
		String value1=(String)xpath_value[1];
		WebElement we=driver.findElement(By.xpath(xpath1));	
		we.clear();
		we.sendKeys(value1);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	//OpenUrl
			public static void openUrl(Object[] url)
			{
				
				try {
				String url1=(String) url[0];
				driver.get(url1);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
	
		
		
	//Browser Launch

	public static void browserLaunch(Object[] bname)
	{
		
		
	try {
		String browsername= (String)bname[0];
	
	if(browsername.equalsIgnoreCase("chrome"))
			{
			
		System.setProperty("webdriver.chrome.driver", "D:\\ABHI\\ST\\selenium\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			}
	
	else if(browsername.equalsIgnoreCase("Fieforx"))
			{
			
			System.setProperty("webdriver.gecko.driver", "D:\\ABHI\\ST\\selenium\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
		}
	
	
		
		
		

	
}
