package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAnthenticationPopUp {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.get("https://www.shoppersstack.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.partialLinkText("Swagger "))).perform();
        
        //driver.findElement(By.partialLinkText("Swagger")).click();
        
        
      driver.switchTo().alert().accept();
       
        driver.findElement(By.id("loginBtn")).click();
        
        
        }

}
