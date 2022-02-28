package questions;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge1 {

	public static void main(String[] args) throws InterruptedException {
	
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		
		
		int loop = 1;
		while(true)
		{
			String s1 = null,s2 = null, s3 = null, s4 = null;
			
			 int attempts;
			 attempts= 0;
			    while(attempts < 10) {
			        try {
			           s1 = driver.findElement(By.xpath("//div[@class='maincounter-number']/span/span[2]")).getText();
			           s2 = driver.findElement(By.xpath("//div[@class='maincounter-number']/span/span[4]")).getText();
			           s3 = driver.findElement(By.xpath("//div[@class='maincounter-number']/span/span[6]")).getText();	
			           s4 = driver.findElement(By.xpath("//div[@class='maincounter-number']/span/span[8]")).getText();	
			            if(Objects.nonNull(s1)&& Objects.nonNull(s2) && Objects.nonNull(s3) && Objects.nonNull(s4)) break;
			        } catch(StaleElementReferenceException e) {
			        }
			        attempts++;
			    }
			    
			    String births_today = null;
			    String bt1 = null,bt2=null;
			    attempts= 0;
			    while(attempts < 10) {
			        try {
			        	bt1 = driver.findElement(By.xpath("//span[@rel='births_today']/span[2]")).getText();	
			        	bt2 = driver.findElement(By.xpath("//span[@rel='births_today']/span[4]")).getText();
			            if(Objects.nonNull(bt1) && Objects.nonNull(bt2)) break;
			        } catch(StaleElementReferenceException e) {
			        }
			        attempts++;
			    }
			    
			    births_today = bt1+","+bt2;		    
			    
			    
			    String deaths_today = null;
			    String dt1 = null,dt2=null;
			    attempts= 0;
			    while(attempts < 10) {
			        try {
			        	dt1 = driver.findElement(By.xpath("//span[@rel='dth1s_today']/span[2]")).getText();	
			        	dt2 = driver.findElement(By.xpath("//span[@rel='dth1s_today']/span[4]")).getText();	
			            if(Objects.nonNull(dt1) && Objects.nonNull(dt2)) break;
			        } catch(StaleElementReferenceException e) {
			        }
			        attempts++;
			    }
			    deaths_today = dt1+","+dt2;
			    
			    
			    String growth_today = null;
			    String gt1 = null,gt2=null;
			    attempts= 0;
			    while(attempts < 10) {
			        try {
			        	gt1 = driver.findElement(By.xpath("//span[@rel='absolute_growth']/span[2]")).getText();
			        	gt2 = driver.findElement(By.xpath("//span[@rel='absolute_growth']/span[4]")).getText();
			            if(Objects.nonNull(gt1) && Objects.nonNull(gt2)) break;
			        } catch(StaleElementReferenceException e) {
			        }
			        attempts++;
			    }
			    growth_today = gt1+","+gt2;
			    
			    System.out.println("Current World Population : "+s1+","+s2+","+s3+","+s4);
			    System.out.println("Births Today : " + births_today);
			    System.out.println("Deaths Today : " + deaths_today);
			    System.out.println("Population Growth Today : " + growth_today);
			    
			    
			  //span[@rel='births_this_year']/span[contains(@class,'rts-nr-int')]
			    
			    attempts= 0;
			    List<WebElement> birthsthisyear = null;
			    while(attempts < 10) {
			        try {
			        	birthsthisyear = driver.findElements(By.xpath("//span[@rel='births_this_year']/span[contains(@class,'rts-nr-int')]"));			        	
			            if(Objects.nonNull(birthsthisyear)) break;
			        } catch(StaleElementReferenceException e) {
			        }
			        attempts++;
			    }
			    String number = null;
			    for(WebElement ele :birthsthisyear)
			    {
			    	number = number+ele.getText()+",";
			    }
			    System.out.println("births this year " +number);
			    
			Thread.sleep(5000);			 
		}
		
	}

}
