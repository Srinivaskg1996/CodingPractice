package webdrivermethods;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementPractice1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String ds=driver.getTitle();
		System.out.println(ds);
		
		driver.findElement(By.id("name")).sendKeys("Srinivas");
		driver.findElement(By.id("email")).sendKeys("Sri@test.com");
		driver.findElement(By.id("phone")).sendKeys("+9876543");
		driver.findElement(By.id("textarea")).sendKeys("Testing my 1st webelement interaction");
		
		
		String name=driver.findElement(By.id("name")).getAttribute("value");
		String email=driver.findElement(By.id("email")).getAttribute("value");
		String phone= driver.findElement(By.id("phone")).getAttribute("value");
		String textarea=driver.findElement(By.id("textarea")).getAttribute("value");
		
		System.out.println(name.equals("Srinivas"));
		
		driver.findElement(By.id("male")).click();
		
		//List<WebElement> checkboxes= driver.findElements(By.cssSelector("input.form-check-input[type='Checkbox']"));
		List<WebElement> checkboxes2= driver.findElements(By.xpath("//input[@class=form-check-input]"));
		System.out.println("Size fo check"+checkboxes2.size());
		/*
		for(int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		for(WebElement x:checkboxes)
		{
			x.click();
		}
		
		//selecting last few checkboxes
		for(int i=4; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//driver.close();
		

	}

}
