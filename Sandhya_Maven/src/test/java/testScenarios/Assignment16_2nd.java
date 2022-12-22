package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16_2nd {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.justrechargeit.com/SignUp.aspx");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("nameTD")).getText());
	     
	     
	     driver.findElement(By.name("signup_name")).sendKeys("ABCTest");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("mobilenoTD")).getText());
	     
	     
	     driver.findElement(By.name("signup_mobileno")).sendKeys("9876543216");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("emailTD")).getText());
	     
	     
	     driver.findElement(By.name("signup_email")).sendKeys("abc123@gmail.com");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("passwordTD")).getText());
	     
	     
	     driver.findElement(By.name("signup_password")).sendKeys("123456");
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     System.out.println(driver.findElement(By.id("tdcondition")).getText());
	   
	     driver.findElement(By.name("imgbtnSubmit")).click();
	     
	    driver.close();
	     
	}

}
