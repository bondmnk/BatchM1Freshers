package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mitraAUtosuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String product="football";
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys(product);
		
       List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
       int size=allAutoSuggestions.size();
       System.out.println("The total auto suggestion for "+product+"  is  - "+size);
       
//       for(int i=0; i<allAutoSuggestions.size();i++) {
//    	   int j=i+1;
//    	String text=allAutoSuggestions.get(i).getText();
//    	System.out.println("The text of "+j+" autosuggestion is  -  "+text);
//       }
       
       System.out.println("All auto suggestions are");
       int j=1;
       for(WebElement ele:allAutoSuggestions ) {
    	  System.out.println("The "+j+"  auto suggestion is "+ ele.getText());
    	  j++;
       }
       
	}

}
