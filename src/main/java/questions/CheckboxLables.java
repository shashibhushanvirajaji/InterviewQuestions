package questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxLables {

	@Test
	public void getLabels()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new  ChromeDriver();
		webDriver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		webDriver.findElements(By.xpath("//label")).forEach(element -> System.out.println(element.getText()));
		
		webDriver.quit();
	}
	
}
