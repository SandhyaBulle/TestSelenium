package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testScenarios.HomePageTestCase;
import testScenarios.OrangeHRM;

public class OrangeHRMLogin {
	 WebDriver driver;
	 
	
	@FindBy(css="input[name='username']")
	WebElement username;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="button[type='submit']")
	WebElement login;
	
	public OrangeHRMLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	public void loginPage(String user,String code)
	
	{
		username.sendKeys(user);
		password.sendKeys(code);
	}
		public HomePageObjects submit()
		{
		login.click();
		HomePageObjects homepage= new HomePageObjects(driver);
		return homepage;
		
		
	}

		public void goTo() {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
	

}
