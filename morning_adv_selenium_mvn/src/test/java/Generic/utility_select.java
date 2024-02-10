package Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility_select {
	public static void Sele_option(WebElement ele,Object data)
	{
		Select sele = Utility_objects.Select_object(ele);
		if(data instanceof Integer)
		{
			sele.selectByIndex((Integer)data);
		}
		else if (data instanceof String) {
		try
		{
			sele.selectByValue((String)data);
		}
		catch (Exception e) {
			sele.selectByVisibleText((String)data);
		}
		}
		
	}
	
	public static void Desele_option(WebElement ele,Object data)
	{
		Select sel = Utility_objects.Select_object(ele);
		if(data instanceof Integer)
		{
			sel.deselectByIndex((Integer)data);
		}
		else if (data instanceof String) {
			try
			{
				sel.deselectByValue((String)data);
			}
			catch(Exception e)
			{
				sel.deselectByVisibleText((String)data);
			}
		}
	}
	
	public static void dese_All_opt(WebElement ele)
	{
		Select sel = Utility_objects.Select_object(ele);
		sel.deselectAll();
	}
	
	public static List<WebElement> get_options(WebElement ele)
	{
		Select sel = Utility_objects.Select_object(ele);
		 return sel.getOptions();
	}
	
	public static WebElement getFirstSelect_opt(WebElement ele) {
		Select sel = Utility_objects.Select_object(ele);
		WebElement f_opt = sel.getFirstSelectedOption();
		return f_opt;
	}
	
}
