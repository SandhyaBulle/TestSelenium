package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1AlertPopUp{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	     
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.className("login_button")).click();
	     driver.findElement(By.id("Button2")).click();
	     
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();
     
	}

}
