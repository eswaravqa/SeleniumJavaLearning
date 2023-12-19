package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();	
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By locator = By.id("Form_getForm_Country");
		
		/*/* 
		 * WebElement country_ele = driver.findElement(locator);
		 * 
		 * Select select = new Select(country_ele); select.selectByIndex(5);
		 * Thread.sleep(1000); select.selectByVisibleText("Brazil"); Thread.sleep(1000);
		 * select.selectByValue("India");
		 */
		
		 doSelectDropDownByIndex(locator, 5);
		 Thread.sleep(1000);
		 doSelectDropDownByVisibleText(locator, "Brazil");
		 Thread.sleep(1000);
		 doSelectDropDownByValue(locator, "India");
		 
		 
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);			
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
