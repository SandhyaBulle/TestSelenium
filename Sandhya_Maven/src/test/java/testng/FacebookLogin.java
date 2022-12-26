package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	     
	     driver.manage().window().maximize();
	     driver.findElement(By.className("login_button")).click();
	     driver.findElement(By.partialLinkText("New User ?")).click();
	     
	     
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().dismiss();
	     driver.close();
  }
}
