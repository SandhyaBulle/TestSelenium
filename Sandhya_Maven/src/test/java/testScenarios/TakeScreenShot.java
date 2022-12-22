package testScenarios;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	Fileutils.copyFile(src,"c:\\users\\sandhya\\dummyticket.png");
	}

}
