package webdrivermethods;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowniwthoutselect {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		WebElement money=driver.findElement(By.id("mat-input-0"));
		money.clear();
		money.sendKeys("10000");
		WebElement intrest=driver.findElement(By.id("mat-input-1"));
		intrest.clear();
		intrest.sendKeys("12");
		WebElement int1=driver.findElement(By.id("mat-input-2"));
		int1.clear();
		int1.sendKeys("0.8");
		

		
		driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
		
		List<WebElement> dropdown= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		
		for(WebElement x:dropdown)
		{
			if(x.getText().equals("Compounded Quarterly"));
			{
			x.click();
			}
			break;
		}
		
		driver.findElement(By.id("CIT-chart-submit")).click();
		String price=driver.findElement(By.xpath("//p[@class='CIT-calc-result--sentence']")).getText();
		int start=price.indexOf("$");
		int end=price.indexOf("!");
		
		String prc= price.substring(start+1,end).replace(",", "");
	
		System.out.println(prc);
		double pcr= Double.parseDouble(prc);
		System.out.println(pcr);
		
		if(pcr==10080.32)
		{
		System.out.println("Test passed");	
		}
		else
		{
			System.out.println("Test failed");
		}

		driver.quit();
}
}