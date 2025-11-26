package seleniumDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UsingMethods {
	
	public static void Select(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}
	
	public static void Select_1(WebElement ele2, String name) {
		Select s1 = new Select(ele2);
		s1.selectByValue(name);
	}

}
