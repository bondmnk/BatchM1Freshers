package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement DayDropDown=driver.findElement(By.id("day"));
		Select select=new Select(DayDropDown);
		select.selectByVisibleText("26");
		
		Thread.sleep(2000l);
		
        WebElement MonthDropDown=driver.findElement(By.id("month"));
		Select select1=new Select(MonthDropDown);
		select1.selectByValue("6");
		
		Thread.sleep(2000l);
		
		 WebElement YearDropDown=driver.findElement(By.id("year"));
		Select select2=new Select(YearDropDown);
		select2.selectByVisibleText("1998");	
	}
}
