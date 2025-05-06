package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		/*System.out.println(driver.getTitle());
		//WebElement frame1= driver.findElement(By.xpath("//frame[@src=\'frame_1.html\']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test2");
		Thread.sleep(2000);*/
		
		//interacting with iframe
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='uHMk6b fsHoPb']")).click();
		
		Thread.sleep(2000);
         driver.quit();
	}

}
