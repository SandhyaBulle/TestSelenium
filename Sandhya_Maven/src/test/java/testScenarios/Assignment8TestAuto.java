package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8TestAuto {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
			new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
			new Select(driver.findElement(By.id("number"))).selectByIndex(3);
			new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
			new Select(driver.findElement(By.name("animals"))).selectByVisibleText("babycat");
	}

}
