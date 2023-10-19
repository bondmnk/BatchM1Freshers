package Testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptPOpUp {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Gajen\\Documents\\indexJavaScript.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000l);
		
		WebElement alertButton=driver.findElement(By.id("AL"));
		alertButton.click();
		
		Thread.sleep(2000l);
		
		Alert alert=driver.switchTo().alert();
		System.out.println("The text of alert popup is - "+alert.getText());
		alert.accept();
		
		Thread.sleep(2000l);
		WebElement conformationButton=driver.findElement(By.id("CN"));
		conformationButton.click();
		System.out.println("The text of conformation popup is - "+alert.getText());
		Thread.sleep(2000l);
		alert.dismiss();
		
		Thread.sleep(2000l);
		WebElement prompttionButton=driver.findElement(By.id("PM"));
		prompttionButton.click();
		System.out.println("The text of prompt popup is - "+alert.getText());
		Thread.sleep(2000l);
		alert.sendKeys("Hello"); //not working properlly
		Thread.sleep(2000l);
		alert.dismiss();

	}

}
