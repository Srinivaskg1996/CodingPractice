package webdrivermethods;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Normal alert
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		Alert al=driver.switchTo().alert();
		 System.out.println(al.getText());
		 
		 al.accept();
		
		
		//Alert with Ok and cancel button.
		 driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		 Alert al2=driver.switchTo().alert();
		 System.out.println(al.getText());
		 al2.accept();
		 String cong= driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 if(cong.equals("You pressed Ok"))
		 {
			 
			 System.out.println("Alerrt is ok");
		 }
		 else
		 {
			 System.out.println("Alert is not ok");
		 }
		 
		 //Alert with ok, cancel and textbox
		
		 driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		 Alert al3= driver.switchTo().alert();
		System.out.println(al3.getText());
		
		al3.sendKeys("Testing");
		al3.accept();
		
		
		//handling alert without switch commands by using explicit wait
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(20));
		Alert my=mywait.until(ExpectedConditions.alertIsPresent());
		my.accept();
		
		Thread.sleep(2000);
		//handling alert with javascript
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		try
		{
		js.executeScript("window.alert=function{};");
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		
		//driver.quit();
		
		 
	}
	
}
