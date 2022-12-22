package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16Dec {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.justrechargeit.com/");
     
     driver.findElement(By.linkText("Sign in")).click();
     
     driver.findElement(By.name("txtUserName")).sendKeys("typedj");
     driver.findElement(By.name("txtPasswd")).sendKeys("typepassword");
     driver.findElement(By.name("txtPasswd")).sendKeys("random");
     
     
     System.out.println(driver.getCurrentUrl());  
     System.out.println(driver.getTitle());
     
     driver.navigate().refresh(); 
     driver.navigate().back();
     
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
     driver.navigate().forward();
     driver.quit();
	}

}
