package questions;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
				
		WebDriver dr = new ChromeDriver(options);
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.twoplugs.com/newsearchserviceneed");
		Thread.sleep(5000);
		WebElement search = dr.findElement(By.xpath("//input[@id='autocomplete']"));
		search.sendKeys("Washington");
		String text;
		do
		{
			search.sendKeys(Keys.ARROW_DOWN);
			text = search.getAttribute("value");
			if(text.equals("Washington, NC, USA"))
			{
				search.sendKeys(Keys.TAB);
				Thread.sleep(3000);
				break;
			}
			
			Thread.sleep(3000);
			
		}while(!text.isEmpty());		
		dr.quit();
	}
}
