package questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Gmail']"));
		action.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		
//		action.contextClick(link).build().perform();
//		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//		
//		WebElement elementOpen = driver.findElement(By.linkText("Open link in new tab"));
//		Robot robot = null;
//		try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		
	}
}
