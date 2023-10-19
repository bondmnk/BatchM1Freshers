package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login']"));
		loginbutton.click();
		
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9353822214");
		driver.findElement(By.xpath("//input[@data-testid='password-input-box-cta']")).sendKeys("s1615691S@");
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withMessage("wait guys");
		
		
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'Raj')]"))));
		
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Mustakim')]")));

		driver.findElement(By.xpath("//div[contains(text(),'Mustakim')]")).click();
		
		
		
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		
	
		driver.quit();
	}

}
