package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		//By password = By.id("input-password");
		By registerLink = By.linkText("Register");
		
		
		String emailFieldPalceHolderValue = driver.findElement(email).getAttribute("placeholder");
		System.out.println(emailFieldPalceHolderValue);
		String registerLinkhrefValue = driver.findElement(registerLink).getAttribute("href");
		System.out.println(registerLinkhrefValue);
		
		
		
		

	}

}
