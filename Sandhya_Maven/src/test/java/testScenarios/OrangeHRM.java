package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.OrangeHRMLogin;

public class OrangeHRM {
	
	@Test
	public static void hrm() throws InterruptedException {
		
		 WebDriver driver1 = new ChromeDriver();
	OrangeHRMLogin  object = new OrangeHRMLogin(driver1);
	object.goTo();
	Thread.sleep(5000);
	object.loginPage("Admin","admin123");
	//object.submit();
	HomePageObjects homepage=object.submit();
	homepage.recuritment();
}
	
	public static void main (String args[]) throws InterruptedException 
	{
		hrm();
	}
}