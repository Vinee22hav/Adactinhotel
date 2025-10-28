package OpenBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.w3c.dom.html.HTMLParagraphElement;

public class Open {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
        //driver.findElement(By.xpath("//p[text='Adactin Launches The Adactin Hotel App!']"));
        //WebElement paragraphTitle = driver.findElement(By.id("Adactin Launches The Adactin Hotel App!"));
        
        driver.findElement(By.name("username")).sendKeys("vineepuji");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("login")).click();
        
        String a = driver.findElement(By.id("username_show")).getAttribute("value");
        Assert.assertEquals(a, "Hello vineepuji!");
        
        WebElement Loc=driver.findElement(By.name("location"));
        Select s1 = new Select(Loc);
        s1.selectByIndex(4);
        
        WebElement Htl = driver.findElement(By.id("hotels"));
        Select s2 = new Select(Htl);
        s2.selectByIndex(3);
        
        WebElement RmTy = driver.findElement(By.id("room_type"));
        Select s3 = new Select(RmTy);
        s3.selectByValue("Deluxe");
        
//        WebElement d = driver.findElement(By.name("room_nos"));
//        Select s4 = new Select(d);
//        s4.selectByValue("3");
        WebElement noofrooms = driver.findElement(By.name("room_nos"));
    	Select s4 = new Select(noofrooms);
    	s4.selectByValue("2");
        
        driver.findElement(By.name("datepick_in")).clear();
        driver.findElement(By.name("datepick_in")).sendKeys("22/07/2002");
        
        
        driver.findElement(By.name("datepick_out")).clear();
        driver.findElement(By.name("datepick_out")).sendKeys("27/07/2002");
        
        WebElement ad = driver.findElement(By.name("adult_room"));
        Select ss = new Select(ad);
        ss.selectByVisibleText("2 - Two");
        
        WebElement Chld = driver.findElement(By.name("child_room"));
        Select se = new Select(Chld);
        se.selectByValue("2");
        
        driver.findElement(By.name("Submit")).click();
        
         
         
		
	}

}
