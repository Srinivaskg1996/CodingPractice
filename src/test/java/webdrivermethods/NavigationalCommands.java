package webdrivermethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Srinivas");
		driver.findElement(By.id("email")).sendKeys("Sri@test.com");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']")).click();
		
		Thread.sleep(2000);
		 driver.navigate().back();
		 System.out.println("back action is done");
		 
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 System.out.println("forward is done");
		 
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		
		 Thread.sleep(2000);
		driver.quit();
	}

}
