package testScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DummyTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
     driver.findElement(By.xpath("//input[@id='travname']")).sendKeys(Keys.ENTER);
     Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
			Select month = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
			
			month.selectByVisibleText("Aug");
			
			
			
			
			driver.findElement(By.xpath("//select[@aria-label='Select year']")).click();
			
	         Select year = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
			
			List<WebElement> option=year.getOptions();
			 for(WebElement oneyear:option)
			 {
				 if(oneyear.getText().equals("1990"))
				 {
					 oneyear.click();
					 break;
				 }
				 
			 }
			
		

		    driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
		    
		    System.out.println("Clicking on female radio button");//click on female radio button
		    driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		    System.out.println("Click on Checkbox");//click on checkbox
		    
		    driver.findElement(By.xpath("//input[@id='addmorepax']")).click();
		    
		    System.out.println("Add passengers"); // Add Passengers
		    
		 //   driver.findElement(By.id("select2-addpaxno-container")).click();
		    
		    
		    WebElement passenger=(driver.findElement(By.id("addpaxno")));
		    Select passengersOption =new Select(passenger);
		    passengersOption.selectByVisibleText("add 3 more passengers (300%) ");
		    
		  // driver.findElement(By.linkText("I'm the only traveler ")).click();
		    
		    
		    
		    System.out.println("Added 3 passengers");
		        
		    
		  driver.findElement(By.xpath("//input[@id='addmorepax']")).click();
		    
		    
		    
 
	}

	



	}

	

