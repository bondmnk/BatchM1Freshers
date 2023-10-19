package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class VerifingAllOptionsInDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//checking drop down is single select or mutli select
		WebElement yearDropDown=driver.findElement(By.id("year"));
		Select select=new Select(yearDropDown);
		boolean multifle = select.isMultiple();
		if(multifle==true) {
			System.out.println("The drop down is multi select");
		}
		else {
			System.out.println("The drop down is single select");
		}
		
		//Verifing all the options in the drop down
		System.out.println("Verifing all options");
		List<WebElement> allOptions = select.getOptions();
		System.out.println("The total options available in year dropdown  - "+allOptions.size());
		int count=0;
		for(WebElement ref :allOptions) {
			count++;
			System.out.println("The "+count+"  option is   -   "+ref.getText());
		}
		
		
		

	}

}
