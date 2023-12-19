package io.com.qa.basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); 
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		

	}

}
