package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFIleUploadPOpUpAutuIt {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 400).perform();
		
		WebElement uploadResumeButton = driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
		uploadResumeButton.click();
		
	}

}
