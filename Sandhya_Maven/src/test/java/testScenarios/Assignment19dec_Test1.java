package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment19dec_Test1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("file:///C:/Users/sandh/Downloads/QE%20-%20index.html");
	     
	     driver.manage().window().maximize();
	     System.out.println(driver.findElement(By.id("inputEmail")).isDisplayed());
	    System.out.println(driver.findElement(By.id("inputPassword")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());
	     
	     
	     driver.findElement(By.id("inputEmail")).sendKeys("sandhya.b@gmail.com");
	     driver.findElement(By.id("inputPassword")).sendKeys("sandhya123@");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     driver.quit();

	}

}
