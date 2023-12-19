package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuySite {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtilities brut = new BrowserUtilities();
		driver = brut.launchBrowser("chrome");
		brut.launchURL("https://www.bestbuy.ca/identity/en-ca/signin?tid=54Xz3KZzaCYl04rLq6gwrQR1iqW463z9nFdzWlPCpA1S8DTnT6L6plovtEaO%252FFr9Kii3CZS2jr2KVpcB5b%252FPTHLNW37X7PXRG17XdwDOX371pj54AlHNJySbCxFgbxGCL6FUaIiBSJrKldNW1YXgEcf8LoF0g7WnfXaf%252BDwSPLDTGSl1opk8x4ymuMSX74%252BRIxhJylFjAPT%252BgnkdT8FoWYk0QZLxQPbrId%252FuU3TH0SLVXqAK9dVsrZ%252BP2KIqciNYX6sFfxlJoF37WFXCUBwdgMmtSlJY3x7%252BDrtMfhB3wmH9rODsGXwTip7jb9W8vqER");
		//driver.get("https://www.bestbuy.ca/");
		
		
		
		//Approach#1: Straight Forward or Direct 
		//driver.findElement(By.id("username")).sendKeys("contacteswart@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Balaji@12");
		
		//Approach#2: Bifurcate webelements from SendKeys 
		//WebElement userName = driver.findElement(By.id("username"));
		//WebElement password = driver.findElement(By.id("password"));
		
		//userName.sendKeys("contacteswart@gmail.com");
		//password.sendKeys("Balaji@12");
		
		//Approach#3: Byfurcate WebElements declaration from By Locator 
		
		//By eId = By.id("username");
		//By pwd = By.id("password");
		
		//WebElement username = driver.findElement(eId);
		//WebElement password = driver.findElement(pwd);
		
		//username.sendKeys("contacteswart@gmail.com");
		//password.sendKeys("Balaji@12");
		
		//Approach#4: Approach#3 + Generic method to FindElements 
		
		//By uid = By.id("username");
		//By pwd = By.id("password");
		
		//getElement(uid).sendKeys("contacteswart@gmail.com");
		//getElement(pwd).sendKeys("Balaji@12");
		
		//Approach#5: Approach#4 + Generic method for Action (SendKeys in this case)
		
		//By uid = By.id("username");
		//By pwd = By.id("password");
		
		//doSendKeys(uid, "contacteswart@gmail.com");
		//doSendKeys(pwd, "Balaji@12");
		
		//Approach#6: Move generic methods to difference class 
		//By uid = By.id("username");
		//By pwd = By.id("password");
		
		//ElementUtilities eleuti = new ElementUtilities(driver);
		
		//eleuti.doSendKeys(uid, "contacteswart@gmail.com");
		//eleuti.doSendKeys(pwd, "Balaji@12");
		
		//Approach#7: Approach#6 + Browser Utilities + Element Utilities 
		
		//Starting of the program Launching Browser and URL are updated with Browser Utilities class
		//By uid = By.id("username");
		//By pwd = By.id("password");
		
		//ElementUtilities eleuti = new ElementUtilities(driver);
		
		//eleuti.doSendKeys(uid, "contacteswart@gmail.com");
		//eleuti.doSendKeys(pwd, "Balaji@12");
		
		//brut.closeBrowser();
		
		//Approach#8: Converting By locators into String locators (Note: Not a very popular approach)
		
		String email_id = "username";
		String password_id = "password";
		
		ElementUtilities eleuti = new ElementUtilities(driver);
		
		eleuti.doSendKeys("id", email_id, "contacteswart@gmail.com");
		eleuti.doSendKeys("id", password_id, "Balaji@12");
		
		driver.findElement(By.xpath("//*[@id=\"signIn\"]/div/button/span")).click();
		
		
		//brut.closeBrowser();
		
		//Approach#9: POM + Framework
		

	}
	
	

}
