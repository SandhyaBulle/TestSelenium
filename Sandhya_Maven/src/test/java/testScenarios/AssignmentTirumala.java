package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentTirumala {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
			
			driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
			new Select(driver.findElement(By.name("stateS"))).selectByIndex(0);
			
			
			new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("Kuwait");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@ng-if='regc.pageDetails.notIndia==true']")).sendKeys("Tirumala");
			
			driver.close();
	}

}
