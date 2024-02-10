package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
	
	public static void mouse_hover(WebDriver driver, WebElement element)
	{
		Utility_objects.Actions_object(driver).moveToElement(element).perform();
	}
	
	public static void mouse_hover_click(WebDriver driver, WebElement element)
	{
		Utility_objects.Actions_object(driver).moveToElement(element).click(element).perform();
	}
	
	public static void right_click(WebDriver driver, WebElement element)
	{
		Utility_objects.Actions_object(driver).contextClick(element).perform();
	}
	
	public static void Double_click(WebDriver driver, WebElement element)
	{
		Utility_objects.Actions_object(driver).doubleClick(element).perform();
	}

}
