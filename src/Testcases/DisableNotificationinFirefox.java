package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DisableNotificationinFirefox {

	public static void main(String[] args) throws Throwable {
		
//		FirefoxOptions option=new FirefoxOptions();
//		option.addPreference("dom.webnotifications.enabled",false );
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/in/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(6000l);
		
		//driver.quit();

	}

}
