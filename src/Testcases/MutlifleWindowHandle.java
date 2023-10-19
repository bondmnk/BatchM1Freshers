package Testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlifleWindowHandle {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("C:/Users/Gajen/Downloads/MultipleWindow%20(1).html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.tagName("input")).click();
	Thread.sleep(10000);
	
	Set<String> ALLWindowIds = driver.getWindowHandles();
	
	for(String ref :ALLWindowIds) {
		if(driver.switchTo().window(ref).getCurrentUrl().equals("https://www.olivegarden.com/home")) {
			break;	
		}
		else {
			driver.close();
		}
	}
	driver.manage().window().maximize();
	driver.findElement(By.id("/menu-listing")).click();
	
	driver.quit();
}
}
