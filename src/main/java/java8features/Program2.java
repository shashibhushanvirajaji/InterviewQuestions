package java8features;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until( dr -> {    // Function functional interface.... 
			dr.navigate().refresh();
			return dr.findElement(By.name("q")); });
		
		element.sendKeys("testng");
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div/span"))
		.parallelStream().filter(elementt->!elementt.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		 
		driver.close();	
				
				
	}
}
