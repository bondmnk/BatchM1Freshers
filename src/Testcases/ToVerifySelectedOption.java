package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement yearDropDown=driver.findElement(By.id("year"));
		Select select=new Select(yearDropDown);
		
		
		select.selectByVisibleText("1998");
		Thread.sleep(3000l);
		WebElement selected1 = select.getFirstSelectedOption();
		System.out.println(selected1.getText());
		
		select.selectByVisibleText("2009");
		Thread.sleep(3000l);
		
		select.selectByVisibleText("1978");
		
		WebElement selected = select.getFirstSelectedOption();
		System.out.println(selected.getText());
	}

}
