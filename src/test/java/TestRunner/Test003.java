package TestRunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseRunner.BaseClass;
import PagesRepo.AmazonHome;
import PagesRepo.AmazonListPage;
import Utilites.ReadXl;

public class Test003 extends BaseClass {

	ReadXl readXl =new ReadXl();
	
	
	@BeforeMethod
	private void TestCaseStartedTime() {
		// TODO Auto-generated method stub

		System.out.println("NAVIGATE TO AMAZON HOME PAGE I.E + https://www.amazon.in/ ");
		driver.navigate().to("https://www.amazon.in/");
	}
	
	@AfterMethod
	private void TestCaseEndedTime() {
		// TODO Auto-generated method stub
		
		
		//Validate current url using assert
		
		System.out.println("ASSERATION FOR TO FIND EXPECTED RESULT");

	}
	
	
	//Iphone
	
	@Test
	public void TC1() throws IOException {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AmazonHome amazonHome = new AmazonHome();
		
		amazonHome.setSearchBox(readXl.ReadXlData("AmazonTestData", 2, 3));
	
		amazonHome.setSearchclick();
		

		
	}
	
	
	
}
