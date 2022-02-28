package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito"); WebDriverManager.chromedriver().setup();
		 * WebDriver driver = new ChromeDriver(options);
		 * driver.get("https://www.google.com/");
		 * Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS); driver.close();
		 */
		
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver driver1 = new ChromeDriver();
		
	
		
	}

}
