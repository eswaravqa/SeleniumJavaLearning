package io.com.qa.basics.selenium;

import io.com.qa.utils.*;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverIntro {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utilities ut = new Utilities();
		
		ut.getBrowser("chrome");
				
		driver.get("https://www.amazon.in/");
		
		String actualBrowserTitle = driver.getTitle();
		System.out.println(actualBrowserTitle);
		
			
		if (actualBrowserTitle.indexOf("Amazon.ca")>=0) {
			System.out.println("Browser Title Test - PASS");
		}
		else { System.out.println("Test FAIL"); }
		
//		driver.quit();
	}

}
