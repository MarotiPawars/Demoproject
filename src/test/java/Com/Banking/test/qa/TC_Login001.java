package Com.Banking.test.qa;

import org.testng.annotations.Test;

import Com.Banking.pageobject.qa.Login_Page;
import junit.framework.Assert;

public class TC_Login001 extends Base_Class
{
	@Test
	public void Tc_login()
	{
		driver.get(baseURL);
		Login_Page lp=new Login_Page(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.btnLogin();
		driver.getTitle();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			System.out.println("Title is match");
		}
		else {
			
			Assert.assertFalse(false);
			System.out.println("Title is Not match");
		}
			
		
		
	}

}
