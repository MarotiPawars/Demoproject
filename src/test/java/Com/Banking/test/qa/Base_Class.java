package Com.Banking.test.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Class 
{
	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr408294";
	public String password ="EjegEvU";
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers_browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
