package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageLocators {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By registerLinkText = By.linkText("Register");
		
		driver.findElement(firstName).sendKeys("Eswara");
		driver.findElement(lastName).sendKeys("Venkata");
		
		//String valueInFirstName = driver.findElement(firstName).getAttribute("value");
		String valueInFirstName = getElementAttribute(firstName, "value");
		System.out.println(valueInFirstName);
		
		//String valueInLastName = driver.findElement(lastName).getAttribute("value");
		String valueInLastName = getElementAttribute(lastName, "value");
		System.out.println(valueInLastName);
		
		String placeholderInFirstName = getElementAttribute(firstName, "placeholder");
		System.out.println(placeholderInFirstName);
		
		String hrefValueInRegisterLink = getElementAttribute(registerLinkText, "href");
		System.out.println(hrefValueInRegisterLink);
				
				
				
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);	
	}
	
	
	
	

}
