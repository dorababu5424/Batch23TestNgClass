package TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseRunner.BaseClass;

public class Test002 extends BaseClass {
	
	
	
	//20000 testcase in this class
	//smoke testing and regression testing
	//2000 testcases in rgression---2500 testing--
	//500 testcases in smoke
	
	@Test(groups = "Regression")
	private void Tc1() {
		// TODO Auto-generated method stub
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println(" open addatic web application"
				+ "open url"
				+ "enter user name and password"
				+ "click on login button"
				+ "Take screenshot "
				+ "use assert and validate current url");
		
		driver.navigate().to("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Dorababu5424");
		
		driver.findElement(By.id("password")).sendKeys("SilenceHeart");
		
		driver.findElement(By.id("login")).click();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
	//Screenshot
		
		Assert.assertEquals("https://adactinhotelapp.com/SearchHotel.php", currentUrl);
		
		
	}

	
	@Test(groups = "Regression")
	private void Tc2() {
		// TODO Auto-generated method stub

		
		System.out.println("Fill all the filed"
				+ "click on search"
				+ "take screenshot "
				+ "user assert and validate url ");
		
	}

	
	@Test(groups = "Smoke")
	private void Tc3() {
		// TODO Auto-generated method stub

		
		System.out.println("fill all the field"
				+ "take screenshot"
				+ "validate using assert");
	}

	
	@Test
	private void Tc4() {
		// TODO Auto-generated method stub
		System.out.println("fill all the field"
				+ "take screenshot"
				+ "validate using assert");
	}

	
	@Test(groups = "smoke")
	private void Tc5() {
		// TODO Auto-generated method stub

		
		System.out.println("TAKE ORDER id AND TAKE SCREENSHOT");
	}

	
	
	
	
}
