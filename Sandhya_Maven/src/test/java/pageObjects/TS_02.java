package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_02 {
	
	WebDriver driver;
	public  TS_02(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
		@FindBy(id="jriTop_signin9")
		WebElement SignIn;
		
		@FindBy(id="insidemidcontainer")
		List<WebElement> AllElements;
		
		public void TC_001()
		{
			SignIn.click();
		}
		public List TC_002(String pageLevel)
		{
			//AllElements.Text(pageLevel);
		    
			return AllElements;
			 
		}
	
	}


