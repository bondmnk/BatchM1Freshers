package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingDataByUsingJavaAcript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		
		WebElement usernameTextField=driver.findElement(By.name("email"));
		String data="Mustakim";
		//sending data by using javascript
		jse.executeScript("arguments[0].value=arguments[1];", usernameTextField,data);

	}
}
