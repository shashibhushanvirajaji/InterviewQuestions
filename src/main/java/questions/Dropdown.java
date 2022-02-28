package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	@Test
	public void selectingMultipleValues()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new  ChromeDriver();		
		
//		webDriver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");		
//		Select dropbox = new Select(webDriver.findElement(By.cssSelector("#multi-select")));
//		dropbox.selectByVisibleText("Florida");
//		dropbox.selectByValue("Ohio");
		
		webDriver.navigate().to("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		webDriver.findElement(By.cssSelector(".select2-selection.select2-selection--single")).click();
		Uninterruptibles.sleepUninterruptibly(5,TimeUnit.SECONDS);
		webDriver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Australia");
		Uninterruptibles.sleepUninterruptibly(5,TimeUnit.SECONDS);
		webDriver.quit();
		
	}
	
	
	
}
