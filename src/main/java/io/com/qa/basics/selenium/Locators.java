package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=pEPixIXYHit%252BgKcMfdqhIn8tWgBIlRh8pFbR0o52MKXyVgGg1XOygMkk0jsbGPruxBMJaX0E0Qhc2SeLFLKYuoa%252BKL7cISmod0MKPN83o85ph0jIhsxWxDArFNkSLxEWPdMu%252FPGXfX%252FnhJ%252FH9EzczKcb4gZ0tm%252FHzFQexYWlo9aP2nTnGHH0Zp3dZoXJrAMUZhoOIa6dI5wWyZkFIC8Yerdw61Li9FUqnxzZEicYP6iSudS%252BjjCi67O5hwpfbl6C3jRT0u2%252BJjJxBlH%252FBcDGnN6ZfpzmaV3SaWDmPAg%252FpMh8iRqz6YshWyhc%252BPM0oF%252BR");
		
		//1.id		
		//driver.findElement(By.id("username")).sendKeys("testmail@12.com")
		
		//2.name
		//driver.findElement(By.name("username")).sendKeys("testmail@12.com")
		
		//By uid = By.id("username");
		//By pwd = By.id("password");
		//By login = By.xpath("//*[@id=\"signIn\"]/div/button/span");
		//doSendKeys(uid, "contacteswart@gmail.com");
		//doSendKeys(pwd, "Balaji@12");
		//doClick(login);
		
		//8.tagName
		
		//String header  = driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header);
		
		//By header = By.tagName("h2");
		//String headerText = doElementGetText(header);
		//System.out.println(headerText);
		
		//How to click on logo by className
		driver.findElement(By.className("bestbuy-logo")).click();
		

	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
