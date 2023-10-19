package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("am");
//		
//List<WebElement> allAutosuggestions = driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li"));
//System.out.println(allAutosuggestions.size());
//		
//	allAutosuggestions.get(5).click();
		
		List<WebElement> allAutosuggestions = driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li//span"));
	
		for(int j=1; j<allAutosuggestions.size(); j++) {
			
			{
				String text=allAutosuggestions.get(j).getText();
				if(text.equals("")) {
					
				}
				else {
					System.out.println(text);
				}
				
			}
			
			
		}
		
	}

}
