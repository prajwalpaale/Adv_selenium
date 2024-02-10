package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_jss {
	public static void Scroll_action(WebDriver driver, WebElement ele) {
		JavascriptExecutor jss = Utility_objects.Jss_object(driver);
		jss.executeScript("arguments.scrollIntoView()", ele);
	}

	public static void disabled_element(WebDriver driver, String value, WebElement ele) {
		JavascriptExecutor jss = Utility_objects.Jss_object(driver);
		jss.executeScript("arguments[0].value='" + value + "'", ele);
	}
}
