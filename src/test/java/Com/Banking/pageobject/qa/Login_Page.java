package Com.Banking.pageobject.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPasswod;

	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys("mngr408294");
	}
	
	public void setPassword(String pwd)
	{
		txtPasswod.sendKeys("EjegEvU");
	}
	public void btnLogin()
	{
		btnLogin.click();
	}
}
