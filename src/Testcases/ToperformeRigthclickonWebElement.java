package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperformeRigthclickonWebElement {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//to scroll the web page
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 300).perform();

		Thread.sleep(3000l);
		//to perform right click on web element 
		WebElement singunLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		
		action.contextClick(singunLink).perform();
	}

}
