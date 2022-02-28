package questions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitconcent {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(StaleElementReferenceException.class);
		
		/*
		 * WebElement ele = (WebElement) wait.until(new Function<WebDriver,
		 * WebElement>() { public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.id("foo")); }
		 * 
		 * });
		 */
		WebElement ele = (WebElement) wait.until( dr -> { return dr.findElements(By.id("foo")); });
	}

}
