package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_001 {
	WebDriver driver;
	@Test
	public void TC_004()
	{
		driver =new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.findElement(By.name("signup_name")).sendKeys("ABCTest");
		driver.findElement(By.name("imgbtnSubmit")).click();
	    System.out.println(driver.findElement(By.id("mobilenoTD")).getText());
	}
	@Test
   public void TC_005()
   {
	   driver.findElement(By.name("signup_mobileno")).sendKeys("9876543216");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("emailTD")).getText());
   }
	@Test
   public void TC_006()
   {
	
	   driver.findElement(By.name("signup_email")).sendKeys("abc123@gmail.com");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("passwordTD")).getText());
   }
	@Test
   public void TC_007() 
   {
	   driver.findElement(By.name("signup_password")).sendKeys("123456");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("tdcondition")).getText());
	   
   }
	@Test
	public void TC_008() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	}
	@Test
	public void TC_009() throws InterruptedException
	
	{
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.findElement(By.name("signup_name")).sendKeys("sandhya");
		driver.findElement(By.name("signup_mobileno")).sendKeys("9959177962");
		driver.findElement(By.name("signup_email")).sendKeys("sandhya7089@gmail.com");
		driver.findElement(By.name("signup_password")).sendKeys("090909");
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.name("imgbtnSubmit")).click();
		Thread.sleep(3000);
		String msg=driver.getTitle();
		System.out.println(msg);
	}
}
