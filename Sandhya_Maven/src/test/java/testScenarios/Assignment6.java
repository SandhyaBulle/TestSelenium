package testScenarios;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/links");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,1000)");
		
		driver.findElement(By.xpath("//div/p[4]/a")).click();
		
		
	boolean status=	driver.findElement(By.cssSelector("#linkResponse")).isDisplayed();
			
	System.out.println();

		driver.close();
		
	}

}
