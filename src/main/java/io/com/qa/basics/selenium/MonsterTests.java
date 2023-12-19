package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MonsterTests {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtilities brUtil = new BrowserUtilities();
		
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://www.monster.ca/");
		
		String pageTitle = brUtil.getPageTitle();
		System.out.println(pageTitle);
		
		ElementUtilities elUtil = new ElementUtilities(driver);
		
		By byrole = By.id("horizontal-input-one-undefined");
		By bylocation = By.id("horizontal-input-two-undefined");
		
		elUtil.doSendKeys(byrole, "Senior QA Analyst");
		elUtil.doSendKeys(bylocation, "CANADA");

	}

}
