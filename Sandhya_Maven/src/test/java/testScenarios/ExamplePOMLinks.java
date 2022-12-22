package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.ToolsQA;

public class ExamplePOMLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		ToolsQA  links= new ToolsQA(driver);
		
		links.content();
	}

}
