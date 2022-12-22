package testScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("sandhya");
		driver.findElement(By.id("lastName")).sendKeys("last");
		driver.findElement(By.id("emailAddress")).sendKeys("sandhya@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("password")).sendKeys("Password@10");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@10");
		
		
		//Check Boxes
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		
		
		//submit button 
		driver.findElement(By.id("submit")).click();
		
	}

}
