package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleShadowRootElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.switchTo().frame("pact");
		
		
		String js = "document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = (WebElement) jse.executeScript(" return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		//element.sendKeys("Greent tea");
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(element);
//		
		jse.executeScript("arguments[0].setAttribute('value','green tea')",element);
		Thread.sleep(10000);
		
		driver.quit();
		
	}
}
