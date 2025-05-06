package webdrivermethods;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebDriver newwindows= driver.switchTo().newWindow(WindowType.TAB);
		newwindows.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println(driver.getTitle());
		
	
		System.out.println(driver.getTitle());
		Set<String> window=driver.getWindowHandles();
		
		ArrayList<String> windowsIDs= new ArrayList<>(window);
		
		String bowser1= windowsIDs.get(0);
		String bowser2= windowsIDs.get(1);	
		System.out.println(bowser1);
		System.out.println(bowser2);
		
		//driver.switchTo().window(bowser2);
		if(driver.getTitle().equals("Automation Testing Practice"))
		{
			
			
			
			driver.close();
			System.out.println("Browser closed in if condition");
		}
		else
		{
			driver.switchTo().window(bowser1);
			
			driver.findElement(By.id("name")).sendKeys("Srinivas");
			driver.findElement(By.id("email")).sendKeys("Sri@test.com");
			driver.findElement(By.id("phone")).sendKeys("+9876543");
			driver.findElement(By.id("textarea")).sendKeys("Testing my 1st webelement interaction");
			
			Thread.sleep(2000);
		driver.close();
		System.out.println("Browser closed in else condition");
		}
		
		driver.quit();
		
	}

}
