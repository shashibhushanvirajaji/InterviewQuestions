package questions;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge2 {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://uncd136.duckcreekondemand.com/Policy/default.aspx");
//		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//input[@id='username-inputEl']")).sendKeys("Test Admin");
//		driver.findElement(By.xpath("//input[@id='password-inputEl']")).sendKeys("Cap@dmin05");
//		driver.findElement(By.xpath("//a[@name='home']")).click();
//		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//		driver.close();
		System.out.println(0.1 * 3);
	    System.out.println(0.1 * 3 == 0.3);
	    System.out.println(0.1 * 2);
	    System.out.println(0.1 * 2 == 0.2);
	}

}

