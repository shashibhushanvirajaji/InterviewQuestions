package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLaunch {

	static int number = 10;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://uatr2-pc.gwre-green-dev.net/pc/PolicyCenter.do");
		
		
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		driver.quit();

	}
	
	public void method()
	{
		System.out.println(number);
	}

}
