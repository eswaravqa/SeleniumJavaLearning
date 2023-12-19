package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		
		//DOM: Document Object Model
		//driver.get("https://ca.indeed.com/");
		
		//why keys are not retained?
		//driver.findElement(By.id("text-input-what")).sendKeys("Senior QA Analyst");
		//driver.findElement(By.id("text-input-where")).sendKeys("Canada");
		
		driver.get("https://www.monster.ca/");
		
		//Approach#1
		
		//driver.findElement(By.id("horizontal-input-one-undefined")).sendKeys("Senior QA Analyst");
		//driver.findElement(By.id("horizontal-input-two-undefined")).sendKeys("Canada");
		
		//Approach#2
		/*
		 * WebElement role = driver.findElement(By.id("horizontal-input-one-undefined")); 
		 * WebElement location = driver.findElement(By.id("horizontal-input-two-undefined"));
		 * 
		 * role.sendKeys("Senior QA Analyst"); 
		 * location.sendKeys("Canada");
		 */
		//Approach#3: By Locator 
		/*
		 * By byrole = By.id("horizontal-input-one-undefined"); By bylocation =
		 * By.id("horizontal-input-two-undefined");
		 * 
		 * WebElement role = driver.findElement(byrole); WebElement location =
		 * driver.findElement(bylocation);
		 * 
		 * role.sendKeys("Senior QA Analyst"); location.sendKeys("Canada");
		 */
		 //Approach#4: By Locator + Generic method for FindElement 
		
			/*
			 * By byrole = By.id("horizontal-input-one-undefined"); By bylocation =
			 * By.id("horizontal-input-two-undefined");
			 * 
			 * getElement(byrole).sendKeys("Senior QA Analyst");
			 * getElement(bylocation).sendKeys("Canada");
			 */
		
		 //Approach#5: By Locator + Generic method for FindElement and SendKeys 
		
			/*
			 * By byrole = By.id("horizontal-input-one-undefined"); By bylocation =
			 * By.id("horizontal-input-two-undefined");
			 * 
			 * doSendKeys(byrole, "Senior QA Analyst"); doSendKeys(bylocation, "CANADA");
			 */
		 //Approach#6: By Locator + Generic method for FindElement and SendKeys in other utilites class
		
		ElementUtilities elUtil = new ElementUtilities(driver);
		
		By byrole = By.id("horizontal-input-one-undefined");
		By bylocation = By.id("horizontal-input-two-undefined");
		
		elUtil.doSendKeys(byrole, "Senior QA Analyst");
		elUtil.doSendKeys(bylocation, "CANADA");
		
		 //Approach#7: By Locator + Generic method for FindElement and SendKeys in other utilites class + Generic methods for Browser Utilities
		//Above approach in a simpler way >> By Locator + Browser Utilities + Element Utilities 
		//For above approach please see MonsterTests section 
		
		//Approach#8: POM >> Page Object Model 
		
	}
	

}
