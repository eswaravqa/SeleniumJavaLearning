package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuItems {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		By shopByCategoryLocator = By.xpath("(//span[text()='Shop by'])[2]");
		By bevaragesLocator = By.xpath("(//a[text()='Beverages'])[2]");
		By coffeeLocator = By.xpath("//a[text()='Coffee']");
		By groundCoffeeLocator = By.xpath("//a[text()='Ground Coffee']");

		
		multiMenuHandle(shopByCategoryLocator, bevaragesLocator, coffeeLocator, groundCoffeeLocator);						

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void multiMenuHandle(By parentMenuLoc, By firstChildMenuLoc, By secondChildMenuLoc,
			By thirdChildMenuLoc) throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		getElement(parentMenuLoc).click();
		Thread.sleep(1000);	
		act.moveToElement(getElement(firstChildMenuLoc)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(secondChildMenuLoc)).perform();
		Thread.sleep(1000);
		getElement(thirdChildMenuLoc).click();			
		
	}

}
