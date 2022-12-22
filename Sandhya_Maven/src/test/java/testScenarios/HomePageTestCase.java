package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePageObjects;
import pageObjects.OrangeHRMLogin;

 public class HomePageTestCase extends OrangeHRM
 {
	 
 public HomePageTestCase(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	 static WebDriver driver= new ChromeDriver();
	
	public static  void hpt() throws InterruptedException
	{
	
		HomePageObjects homepage = null;
		homepage.recuritment();
	}
	
	
   public static void main(String[] args) throws InterruptedException
	{
	   hpt();
	    
	}
 }

