package BaseRunner;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	
	public static WebDriver driver;
	
	public  String browserName = "chrome";
	
	
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
	
	
	
	if (browserName.equals("chrome")) {
	
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}else if (browserName.equals("fireFox")) {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVC\\eclipse-workspace\\Batch23Testng\\src\\test\\resources\\Drivers101\\chromedriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}else if (browserName.equals("Internetexploer")) {
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVC\\eclipse-workspace\\Batch23Testng\\src\\test\\resources\\Drivers101\\chromedriver.exe");
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}else {
		System.out.println("No browser found");
	}
	
	{
		
	}
	{
		
	}
	
	

			
	}
	
	@AfterClass
	
	private void BrowserTeardown() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("CHROME BROWSER QUIT");
	}
	

}
