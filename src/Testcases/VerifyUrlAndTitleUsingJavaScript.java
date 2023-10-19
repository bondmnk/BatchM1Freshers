package Testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlAndTitleUsingJavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//TO verify Title by using java script click
		String Title=jse.executeScript("return document.title").toString();
		
		if(Title.equals("Log in to Facebook")) {
			System.out.println("the test cases pass,Have same title");
		}
		else {
			System.out.println("the test cases fails, having diffrent title");
		}
		
		//TO verify url  by using java script click
       String url=jse.executeScript("return document.URL").toString();
		
		if(url.equals("https://www.facebook.com/login/")) {
			System.out.println("the test cases pass, the url is same ");
		}
		else {
			System.out.println("the test cases fails, url is diffrent");
		}
		
		
	}
}
