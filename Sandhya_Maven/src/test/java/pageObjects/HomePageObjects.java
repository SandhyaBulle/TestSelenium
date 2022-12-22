package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
   
	WebDriver driver;
	public HomePageObjects(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//@FindBy(css=".oxd-icon.bi-list.oxd-topbar-header-hamburger")
	//WebElement search;
	
	@FindBy(xpath="//a[@text='Recruitment']")
	WebElement recuritmentButton;
	
	

	/*public void search()
	{
		search.click();
	}*/
	public void recuritment()
	{
		recuritmentButton.click();
		
	}
}
