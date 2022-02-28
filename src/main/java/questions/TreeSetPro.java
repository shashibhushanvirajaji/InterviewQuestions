package questions;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TreeSetPro {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		Set<String> linkNames = new TreeSet<String>();
		driver.findElements(By.tagName("a")).forEach(element -> { 
			linkNames.add(element.getText());
		});
		
		System.out.println(linkNames);
	}

}
