package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotifications {

	public static void main(String[] args) throws Throwable {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
		driver.get("https://in.puma.com/in/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(15000l);
		
		driver.quit();
		

	}

}
