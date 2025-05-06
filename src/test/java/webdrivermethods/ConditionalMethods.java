package webdrivermethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		boolean inputname= driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println(inputname);
		
		WebElement maleButton=driver.findElement(By.xpath("//input[@id='male']"));
		maleButton.click();
		System.out.println(maleButton.isSelected());
		
		WebElement name=driver.findElement(By.xpath("//label[normalize-space()='Name:']"));
		System.out.println(name.isDisplayed());
		
	}

}
