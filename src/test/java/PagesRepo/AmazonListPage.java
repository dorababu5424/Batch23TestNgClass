package PagesRepo;

import org.openqa.selenium.By;

import BaseRunner.BaseClass;

public class AmazonListPage extends BaseClass {

	
	public void SelectProduct(int i) {
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"+ i +"")).click();
	}
	
}
