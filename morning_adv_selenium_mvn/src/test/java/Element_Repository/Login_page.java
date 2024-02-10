package Element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy(id = "email")
	private WebElement email_TF;
	
	@FindBy(id = "pass")
	private WebElement pwd_TF;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail_TF()
	{
		return email_TF;
	}
	
	public WebElement getPass_TF()
	{
		return pwd_TF;
	}
	//ok checked

}
