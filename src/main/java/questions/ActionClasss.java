package questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClasss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");		
		WebDriver dr = new ChromeDriver(options);
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.com/");
		
		WebElement ff = null;
		try
		{
		 ff = dr.findElement(By.linkText("ggg"));
		 
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		
		List<WebElement> links = dr.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link : links)			
			System.out.println(link.getText());
		
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(dr)
		 * .withTimeout(Duration.ofSeconds(60)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 */
		/*
		 * Robot r = null; try { r = new Robot(); } catch (AWTException e1) {
		 * e1.printStackTrace(); } r.keyPress(KeyEvent.VK_CONTROL);
		 * r.keyPress(KeyEvent.VK_T); r.keyRelease(KeyEvent.VK_CONTROL);
		 * r.keyRelease(KeyEvent.VK_T);
		 * 
		 * //WebDriverWait wait = new WebDriverWait(dr, 60); Thread.sleep(2000);
		 * 
		 * Set<String> handles = dr.getWindowHandles(); List<String> handlelist = new
		 * ArrayList<>(handles); System.out.println(handlelist.size());
		 * System.out.println(handlelist.get(0)); System.out.println(handlelist.get(1));
		 * 
		 * System.out.println(dr.switchTo().window(handlelist.get(1)).getTitle());
		 * dr.switchTo().defaultContent();
		 */
        
		Thread.sleep(2000);
		
		dr.quit();
		

	}

}
