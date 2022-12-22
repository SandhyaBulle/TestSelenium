package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA {

	
	 WebDriver driver=new ChromeDriver();
	 
	public ToolsQA(WebDriver driver)
     {
    	 
    this.driver=driver;	
    PageFactory.initElements(driver,this);
    	 
	}
  @FindBy(xpath="//div/p[4]/a")
  WebElement content;
  
  @FindBy(css="#linkResponse")
  WebElement msg;
  
  
  public void content() throws InterruptedException
  {
	  content.click();
	  
	  Thread.sleep(5000);
  boolean status=msg.isDisplayed();
  System.out.println(status);
  }
}
