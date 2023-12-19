package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHub {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		By locator = By.xpath("//tbody//a");
		
		clickOnNameLink(locator, "Jordan");
		
	}

	
	public static void clickOnNameLink(By locator, String linkName) {
		List<WebElement> names = driver.findElements(locator);
		
		System.out.println(names.size());
		
		for (WebElement e : names) {
			String nameText = e.getText();
			
			if (nameText.contains(linkName)) {
				e.click();
				System.out.println(nameText);
			}
			
			//System.out.println(nameText);
			
		}
		
	}
}
	

	


