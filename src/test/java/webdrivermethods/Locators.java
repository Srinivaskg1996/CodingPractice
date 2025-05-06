package webdrivermethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 try
		 {
		 //driver.findElement(By.xpath("//input[@id='name']/following-sibling::input")).sendKeys("test.com");
		// driver.findElement(By.xpath("//div[@class='form-group']/label/input/label/input")).sendKeys("test");
		 driver.findElement(By.xpath("//div[@class='form-group']/parent::input")).sendKeys("test");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getCause());
			 System.out.println("Locator is not correct");
		 }
		 }

}
