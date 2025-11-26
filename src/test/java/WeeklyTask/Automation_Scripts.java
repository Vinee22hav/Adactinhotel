package WeeklyTask;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Scripts {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        
	        // 1. Open W3Schools
	        driver.get("https://www.w3schools.com");
	        System.out.println("Home Page Title: " + driver.getTitle());

	        // 2. Mouse Hover (Tutorials Menu)
	        Actions act = new Actions(driver);
	        WebElement tutorialsMenu = driver.findElement(By.id("navbtn_tutorials"));
	        act.moveToElement(tutorialsMenu).perform();
	        Thread.sleep(2000);

	        // 3. Click on Learn HTML
	        driver.findElement(By.linkText("Learn HTML")).click();
	        System.out.println("HTML Page Title: " + driver.getTitle());

	        // 4. Click Try It Yourself button
	        driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();

	        // 5. Handle Multiple Windows
	        String parentWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String win : allWindows) {
	            driver.switchTo().window(win);
	        }
	        System.out.println("Switched to Editor Page");

	        // 6. Switch to Frame and Edit HTML code
	        driver.switchTo().frame("iframeResult");
	        WebElement para = driver.findElement(By.xpath("//p"));
	        System.out.println("Paragraph Text: " + para.getText());

	        driver.switchTo().defaultContent();

	        // 7. Scroll down using JavaScript
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,600);");
	        Thread.sleep(2000);

	        // 8. Click Home icon to return back
	        driver.findElement(By.xpath("//a[@title='Home']")).click();

	        // Switch back to Parent
	        driver.switchTo().window(parentWindow);

	        // 9. Navigate to WebTables Page
	        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	        System.out.println("Table Page Title: " + driver.getTitle());

	        // 10. Extract Web Table Data
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	        for (WebElement row : rows) {
	            System.out.println(row.getText());
	        }

	        // 11. Take Screenshot
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File src = screenshot.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src, new File("C:\\Users\\Lenovo\\Desktop\\Javajava\\Demo\\JavaProject\\Bettyk_WebDriver\\target"));
	        System.out.println("Screenshot captured");

	        // 12. Perform Search
	        driver.findElement(By.id("search2")).sendKeys("CSS" + Keys.ENTER);

	        // 13. Wait for element after search
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement cssLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(),'CSS')]")));
	        System.out.println("Search Result Found: " + cssLink.getText());

	        // 14. Alert Example (W3Schools JS Alert Demo Page)
	        driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	        driver.switchTo().frame("iframeResult");
	        driver.findElement(By.tagName("button")).click();

	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert Text: " + alert.getText());
	        alert.accept();
	        driver.switchTo().defaultContent();

	        // 15. Close and Quit
	        driver.close();
	        driver.quit();

	        System.out.println("Automation Completed Successfully!");	

	}

}
/**
 * Alerts
 * screen short
 * Mouse hover
 * Actions
 * Drag And Drop
 * Windows Handling
 * login 
 * Drop down
 * open browser
 * ***/
