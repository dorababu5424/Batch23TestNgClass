package TestRunner;


import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseRunner.BaseClass;

//prequest--


//Browser---chrome
//Application -url
//Navigate to home page



//1)Hp laptop adding to cart--- Expected Result iteam add successfull 
//2)Dell laptop adding to cart
//3)Lenovo laptop
//4) Asus laptop



public class Test001 extends BaseClass {
	
	
	

	
	@BeforeMethod
	private void TestCaseStartedTime() {
		// TODO Auto-generated method stub

		System.out.println("NAVIGATE TO AMAZON HOME PAGE I.E + https://www.amazon.in/ ");
		driver.navigate().to("https://www.amazon.in/");
	}
	
	@AfterMethod
	private void TestCaseEndedTime() {
		// TODO Auto-generated method stub
		
		System.out.println("ASSERATION FOR TO FIND EXPECTED RESULT");

	}
	
	
	
	
	//1)Hp laptop
	@Test
	private void Tc1() {
		// TODO Auto-generated method stub
		
		System.out.println("Search for HP LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");
		
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("HP Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}
		
		

	}
	//2)Dell laptop
	@Test
	private void Tc2() {
		// TODO Auto-generated method stub

		System.out.println("Search for DELL LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dell Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}

	}
	//3)Lenovo laptop
	@Test
	private void Tc3() {
		// TODO Auto-generated method stub

		
		System.out.println("Search for LENOVO LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");

		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lenovo Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}
		
	}
	//4) Asus laptop
	@Test
	private void Tc4() {
		// TODO Auto-generated method stub
		
		System.out.println("Search for ASSUS LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("assus Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}


	}
	
	

}