package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSVGElements {

	@Test
	public void handlingSVGElements()
	{
		
				
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		if(d.findElement(By.xpath("//*[local-name()='svg']//*[name()='g']")).isDisplayed())
		{
			System.out.println("out");
		}
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		
		d.close();
	}
}
