package java8features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateelemenTest {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement element = driver.findElement(By.xpath("q"));
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//wait.until(ExpectedConditions.visibilityOf(element)).sendKeys("shahsi bhushan");

		WebElement element = wait.until( dr -> {    // Function functional interface.... 
			dr.navigate().refresh();			
			return dr.findElement(By.name("q")); });
		
		element.sendKeys("shashinbhushan");

		
		driver.quit();
	}
}
