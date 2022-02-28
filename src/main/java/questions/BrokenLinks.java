package questions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.CharMatcher;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();

		dr.get("https://www.amazon.in/");

		Set<String> ss = new HashSet<>();
		
		
		dr.findElements(By.tagName("a")).stream().forEach(element -> {
			ss.add(element.getText());
		});
		System.out.println(ss.size());

		
		ss.parallelStream().forEachOrdered(text -> System.out.println(text));
//		
//		dr.findElements(By.tagName("a"))
//		.parallelStream()
//		.forEach(element -> {
//			
//			String url = element.getAttribute("href");
//			URL url1 = null;
//			try {
//				url1 = new URL(url);
//			} catch (MalformedURLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 HttpURLConnection connection = null;
//			try {
//				connection = (HttpURLConnection)url1.openConnection();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//				try {
//					connection.connect();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				try {
//					if(connection.getResponseCode()>=400) {				
//					System.out.println("Broken link = "+url );	
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		});

		dr.quit();
	}

	static void checkForBrokenLink(String url) throws IOException {

		try {
			URL url1 = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
			connection.connect();

		} catch (MalformedURLException e) {
		}
	}

}
