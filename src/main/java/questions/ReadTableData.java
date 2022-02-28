package questions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadTableData {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(""));
		
		driver.get("");
		driver.findElements(By.xpath(xpathExpression))
				

	}

}
