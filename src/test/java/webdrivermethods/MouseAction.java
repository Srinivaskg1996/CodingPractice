package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MouseAction {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		WebElement a= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement b= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(a).build().perform();
		
		/*WebDriverWait mywait=new WebDriverWait (driver,Duration.ofSeconds(5));
		mywait.until(ExpectedConditions.visibilityOf(b));
		
		
		ac.moveToElement(b).click().perform();
		System.out.println(driver.getTitle());*/
				
		

	}

}
