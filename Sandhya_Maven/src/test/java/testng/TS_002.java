package testng;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS_002 {

	WebDriver driver= new ChromeDriver();
	
	@Test
	public void TC_010()
	{
		
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/");
		
		
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void TC_011()
	{
		driver.findElement(By.id("jriTop_signin9")).click();
		
		
	}
	@Test
	public void TC_012() 
	{
	List<WebElement> allElements =driver.findElements(By.cssSelector("input.inputsbg"));
	
	System.out.println(allElements.size());
		
			if(driver.findElements(By.id("forgotpassword")).size()>0)
			{
				System.out.println("Displayed the forgot password link");
			}
			else
			{
			System.out.println("Not Displayed the forgot password link");
	        
			}
	 
	if(driver.findElements(By.xpath("//img[@title='Sign In with Facebook']")).size()>0)
	{
		System.out.println("Displayed the sign In with Facebook link");	
	}
	else
	{
		System.out.println("Not Displayed the sign In with Facebook link");
	}
		
		
		if(driver.findElements(By.xpath("//img[@title='Sign In with Google']")).size()>0)
		{
			
		System.out.println("Displayed the sign In with Google link");
		}
		else
		{
			System.out.println("Not Displayed the sign In with Google link");	
		}
		
		
 	}
	@Test
	public void TC_013() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(By.name("imgbtnSignin")).click();
		if(driver.findElements(By.id("MessageCaption2")).size()>0)
			
		System.out.println("email error message is displayed");
		else
			System.out.println("email error message is not displayed");	
		driver.findElement(By.name("txtUserName")).sendKeys("sandhya7089@gmail.com");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
		
		if(driver.findElements(By.id("MessageCaption3")).size()>0)
			
		System.out.println("password error message is displayed");
		else
		System.out.println("password error message is not displayed");
		
		
		driver.findElement(By.name("txtPasswd")).sendKeys("090909");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
		if(driver.findElements(By.id("MessageCaption4")).size()>0)
			
		 System.out.println("captcha error message is displayed");
		else

			System.out.println("captcha error message is not displayed");
		
	}
	@Test
    public void TC_016() throws InterruptedException
    {
    	driver.findElement(By.className("hyperLink")).click();
    	Thread.sleep(5000);
    	//driver.switchTo().window("Forgot your password?");
    	System.out.println(driver.getCurrentUrl());
    	
    }
	@Test
	public void TC_017() throws InterruptedException {
		
		Thread.sleep(5000);
		List<WebElement> displayMsg=driver.findElements(By.xpath("//td[@class='defaulttext1']"));
		
		if(displayMsg.size()>0)
				{
			System.out.println("Display msg is displayed on forgot error page");
				}
		else
			System.out.println("Display msg is not displayed on forgot error page");
		
		boolean emailEnter=driver.findElement(By.id("forgotpass_txtEmailId")).isEnabled();
		System.out.println("enabled Email enter editbox on forgot error page"+" "+emailEnter);
		
		
		if(driver.findElements(By.id("forgotpass_imgbtnSubmit")).size()>0)
		{
	System.out.println("submit button is displayed on forgot error page");
		}
else
	System.out.println("submit button is not displayed on forgot error page");

	}
	@Test
	public void TC_018() throws InterruptedException 
	
	{
   
		
    driver.findElement(By.id("forgotpass_imgbtnSubmit")).click();
    	
    	
    	if(driver.findElements(By.id("forgotpass_lblError")).size()>0)
		{
	System.out.println("'Enter your email id' error msg is displayed on the forgot password page");
		}
     else
	System.out.println("'Enter your email id' error msg is not displayed on the forgot password page");
    	
    }
	@Test
	public void TC_019()
	{
	    
		driver.findElement(By.id("forgotpass_txtEmailId")).sendKeys("sandhya7089@gmail.com");
		
	}
	
}
