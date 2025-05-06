package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// select type of dropdowns
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement country= driver.findElement(By.id("country"));
		Select dropdown= new Select(country);
		
	    dropdown.selectByVisibleText("China");  //visual text is case sensitive
	    System.out.println("China is selected");
	    
	    Thread.sleep(2000);
	    
		dropdown.selectByValue("japan");
		System.out.println("Japan is selected");
	    
		  Thread.sleep(2000);
		  dropdown.selectByIndex(3);
		  System.out.println("Germany is selected");

	}

}
