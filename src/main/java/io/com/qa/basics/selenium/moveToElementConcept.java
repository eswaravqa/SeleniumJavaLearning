package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html			
		//	http://mrbool.com/
				
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		By parentMenuLoc = By.cssSelector("a.menulink");
		By childMenuLoc = By.linkText("COURSES");	
		
		parentChildMenu(parentMenuLoc, childMenuLoc);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenu(By parentMenuLoc, By childMenuLoc) throws InterruptedException {
		
		Actions act = new Actions (driver);		
		act.moveToElement(getElement(parentMenuLoc)).perform();
		Thread.sleep(2000);
		
		driver.findElement(childMenuLoc).click();
		
		
		
	}
	
	
	
	

}
