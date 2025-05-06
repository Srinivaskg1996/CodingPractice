package webdrivermethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowsusingforloop {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebDriver webdriver2 = driver.switchTo().newWindow(WindowType.TAB);
		  webdriver2.get("https://demo.automationtesting.in/Register.html");
		  
		  WebDriver webdriver3= driver.switchTo().newWindow(WindowType.TAB);
		  webdriver3.get("https://demo.automationtesting.in/FileUpload.html");
		  
		 Set<String> WindowsIDs= driver.getWindowHandles();
		// ArrayList<String> windows= new ArrayList<>(WindowsIDs);
		 
		for(String x:WindowsIDs)
		{
			driver.switchTo().window(x);
			String title= driver.getTitle();
			
				if(title.equals("Automation Testing Practice"))
				{
					driver.close();
					System.out.println("Window is closed");
				}
			
		}

	}

	}
