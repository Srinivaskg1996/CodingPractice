package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNGfirstprogramme {
   WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void findtitle()
	{
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("AutoMation TeSting practice"))
		{
			System.out.println("Title is matching");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Title is not matching");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(driver.getTitle(), "Automation Testing practice");
	}
	
	@Test//(dependsOnMethods= {"setup"} )
	void enablecheckbox()
	{
		driver.findElement(By.id("male")).click();
		
		
	}
	
	@AfterClass
	void closebrowser()
	{
		driver.quit();
	}
	
}
