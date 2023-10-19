package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOpUPUsingSendKeys {

	public static void main(String[] args) {
		

			 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("photo-upload")).sendKeys("C:\\Users\\Gajen\\Pictures\\Saved Pictures\\pexels-photo-372166.jpeg");
		
	}

} 
