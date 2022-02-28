package java8features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		/*
		 1. launch amazon.in
		 2. get the text of each link
		 3. remove blank text
		 4. remove the duplicates
		 5. sort the list of links
		 6. print those links starting with C
		  
		 */
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));		
		
		links.stream()
		.map(element -> element.getText())
		.filter(element -> !element.isBlank())
		.distinct().sorted()
		.filter(element -> element.startsWith("C") || element.startsWith("D"))
		.forEach(System.out::println);
		
		driver.quit();
		
	}

}
