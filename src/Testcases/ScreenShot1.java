package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		HasFullPageScreenshot ts=(HasFullPageScreenshot)driver;
		String localDate = LocalDateTime.now().toString().replace(':', '-');
		   File tempFile = ts.getFullPageScreenshotAs(OutputType.FILE);
		   
		 File permanentFile=new File("./Screenshots/"+localDate+"Fullpage.png");
		 FileHandler.copy(tempFile, permanentFile);
	}
	}


