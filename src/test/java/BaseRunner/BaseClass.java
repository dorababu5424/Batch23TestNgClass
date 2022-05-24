package BaseRunner;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseClass {
	
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void SuiteStarted() {
		
		System.out.println("AMAZON APPLICATION TESTCASE SUITE STARTED ");
		Date date = new Date();
		System.out.println( date.getTime());
		
	}
	
	@AfterSuite
	public void SuitedFinished() {
		System.out.println("AMAZON APPLICATION TESTCASE SUITE ENDED ");
		Date date = new Date();
		System.out.println( date.getTime());
	}
	
	
	
	@BeforeTest
	private void TestStarted() {
		// TODO Auto-generated method stub

	}
	
	@AfterTest
	private void TestEnded() {
		// TODO Auto-generated method stub

	}
	
	@BeforeClass
	public void LunchBrowser()
	{
		
	System.out.println("CHROME BROWSER LUNCHED");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVC\\eclipse-workspace\\Batch23Testng\\src\\test\\resources\\Drivers101\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
			
	}
	
	@AfterClass
	
	private void BrowserTeardown() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("CHROME BROWSER QUIT");
	}
	

}
