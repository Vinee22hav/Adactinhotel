package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void getBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		
		}
		

	}
	
	public void getURL(String Url) {
		driver.get(Url);
	}
	public void sendkeys(WebElement Ele, String Txt) {
		Ele.sendKeys(Txt);
		

	}
	public void click(WebElement ele) {
		ele.click();
		

	}
	
	
	

}
