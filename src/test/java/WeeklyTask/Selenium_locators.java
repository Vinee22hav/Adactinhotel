package WeeklyTask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_locators {

	public static void main(String[] args) throws InterruptedException {
		/******
		 * Id
		 * naem
		 * classname
		 * tagname
		 * linkText
		 * partialLinktext
		 * 
		 * cssSelectors---
		 * id #email
		 * by class .class
		 * Tag class
		 * multiple attribute ---input[name = 'email']
		 * 
		 * xpath
		 * By attribute //input[@id = ''email]
		 * contains() //input[contains(text(),'name')]
		 * Start-with //input[starts-with(@name,'pass')]
		 */
	

		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();

		        // 0) Open Cleartrip Holidays
		        driver.get("https://www.cleartrip.com/holidays/");

		        // NOTE: Real attributes (id/name/class) can change anytime in UI.
		        // Adjust locators using browser DevTools if something stops working.

		        // 1) By.id  - example: try to locate search input or any element having a stable id
		        try {
		            WebElement elementById = driver.findElement(By.id("headerHolidays")); // example, change if different
		            System.out.println("Found element with id 'headerHolidays': " + elementById.isDisplayed());
		        } catch (Exception e) {
		            System.out.println("Element with id 'headerHolidays' not found, update id from DevTools.");
		        }

		        // 2) By.name - many modern SPA sites use name on forms; update name as per DevTools if needed
		        try {
		            WebElement elementByName = driver.findElement(By.name("destination")); // example
		            System.out.println("Found element with name 'destination': " + elementByName.isDisplayed());
		        } catch (Exception e) {
		            System.out.println("Element with name 'destination' not found, update name from DevTools.");
		        }

		        // 3) By.className - use a single class, not full class attribute
		        try {
		            WebElement valueDealsSection = driver.findElement(By.className("value-for-money-deals")); // example class
		            System.out.println("Value For Money Deals section visible: " + valueDealsSection.isDisplayed());
		        } catch (Exception e) {
		            System.out.println("Section with class 'value-for-money-deals' not found, change class from DevTools.");
		        }

		        // 4) By.tagName - get list of cards or headings
		        List<WebElement> headings = driver.findElements(By.tagName("h2"));
		        System.out.println("Total h2 headings on Holidays page: " + headings.size());
		        for (WebElement h : headings) {
		            System.out.println("h2 text: " + h.getText());
		        }

		        // 5) By.linkText - for full visible link text (like “All Destinations”)
		        try {
		            WebElement allDestinationsLink = driver.findElement(By.linkText("All Destinations"));
		            System.out.println("Clicking 'All Destinations' link.");
		            allDestinationsLink.click();
		            Thread.sleep(2000);
		            driver.navigate().back();
		        } catch (Exception e) {
		            System.out.println("'All Destinations' link not found, confirm exact text on page.");
		        }

		        // 6) By.partialLinkText - match part of visible text (like “Destinations”)
		        try {
		            WebElement partialDestinationsLink = driver.findElement(By.partialLinkText("Destinations"));
		            System.out.println("Clicking link with partial text 'Destinations'.");
		            partialDestinationsLink.click();
		            Thread.sleep(2000);
		            driver.navigate().back();
		        } catch (Exception e) {
		            System.out.println("Link with partial text 'Destinations' not found, update partial text.");
		        }

		        // 7) By.cssSelector - powerful and preferred for most cases
		        // Example: select first destination card under “Gulf Getaways” section
		        try {
		            WebElement gulfGetawaysHeading = driver.findElement(
		                    By.cssSelector("h2, h3, h4")); // sample; refine with real CSS from DevTools
		            System.out.println("Sample heading with CSS locator: " + gulfGetawaysHeading.getText());
		        } catch (Exception e) {
		            System.out.println("Update CSS selector after checking page structure with DevTools.");
		        }

		        // Example CSS: find a card that contains text “Abu Dhabi” (using parent div)
		        try {
		            WebElement abuDhabiCard = driver.findElement(
		                    By.cssSelector("div:has(h3:contains('Abu Dhabi'))")); // works in some drivers, else use xpath below
		            System.out.println("Abu Dhabi card visible with CSS: " + abuDhabiCard.isDisplayed());
		        } catch (Exception e) {
		            System.out.println("Complex CSS ':has' / ':contains' may not be supported, better use XPath for text.");
		        }

		        // 8) By.xpath - very flexible, especially for text-based matching
		        // Example: select Gulf Getaways header
		        try {
		            WebElement gulfHeader = driver.findElement(
		                    By.xpath("//h2[normalize-space()='Gulf Getaways']"));
		            System.out.println("Gulf Getaways header text: " + gulfHeader.getText());
		        } catch (Exception e) {
		            System.out.println("XPath for 'Gulf Getaways' header failed, check heading level/hierarchy.");
		        }

		        // Example: destination title “Abu Dhabi”
		        try {
		            WebElement abuDhabiTitle = driver.findElement(
		                    By.xpath("//h3[normalize-space()='Abu Dhabi']"));
		            System.out.println("Abu Dhabi title found: " + abuDhabiTitle.getText());
		        } catch (Exception e) {
		            System.out.println("XPath for 'Abu Dhabi' card failed, verify exact text.");
		        }

		        // Example: price element under Abu Dhabi card using parent-child relationship
		        try {
		            WebElement abuDhabiPrice = driver.findElement(
		                    By.xpath("//h3[normalize-space()='Abu Dhabi']/following::div[contains(text(),'₹')][1]"));
		            System.out.println("Abu Dhabi price text: " + abuDhabiPrice.getText());
		        } catch (Exception e) {
		            System.out.println("XPath for Abu Dhabi price failed, adjust hierarchy from DevTools.");
		        }

		        // Example: testimonials section title “Stories from the Road”
		        try {
		            WebElement storiesTitle = driver.findElement(
		                    By.xpath("//h2[contains(normalize-space(),'Stories from the Road')]"));
		            System.out.println("Stories section title: " + storiesTitle.getText());
		        } catch (Exception e) {
		            System.out.println("XPath for 'Stories from the Road' failed, verify heading tag.");
		        }

		        // Example: testimonial author “Amrita Keshari”
		        try {
		            WebElement testimonialAuthor = driver.findElement(
		                    By.xpath("//*[contains(text(),'Amrita Keshari')]"));
		            System.out.println("Found testimonial author: " + testimonialAuthor.getText());
		        } catch (Exception e) {
		            System.out.println("XPath for 'Amrita Keshari' failed, verify text.");
		        }

		        Thread.sleep(4000);
		        driver.quit();

		
	    }
		
	}

