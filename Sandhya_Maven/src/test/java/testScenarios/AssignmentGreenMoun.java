package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentGreenMoun {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver= new ChromeDriver();
		
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement link =driver.findElement(By.linkText("Contact Us"));
		Actions act=new Actions(driver);
		act.scrollToElement(link);
		link.click();

	}

}
