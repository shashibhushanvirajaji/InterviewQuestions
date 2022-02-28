package java8features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionEx {

	public static void main(String[] args) {
		
		
		/*
		 * Function<Integer,Integer> add = number -> {return number+ 10;};
		 * System.out.println(add.apply(4));
		 * 
		 * 
		 * Function<String,Integer> length = string -> {return string.length(); };
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 driver.findElements(By.tagName(("a"))).stream().map(new Function<WebElement, String()> function).filter(s -> !s.isEmpty())
		 .forEach(System.out::println);
		
		 driver.quit();
	}
}
