package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUserName")).sendKeys("TestABC123@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("testING@22");
		driver.findElement(By.id("txtCaptcha")).sendKeys("59");
		driver.findElement(By.id("imgbtnSignin")).click();
		
		
		

	}

}
