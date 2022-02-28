package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		//options.addArguments(arguments)
//		
//		cap.acceptInsecureCerts();
//		
//		options.set
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("a#nav-link-prime"))).perform();
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		
		driver.close();
		
	
		
		
		
		
		
		
	}

}
