package io.com.qa.basics.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmaoznFooters {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://amazon.ca");
		
	List<WebElement> footerLinks =	driver.findElements(By.xpath("//div[@id='navFooter']//a"));
	
	System.out.println(footerLinks.size());
	
	for (WebElement e : footerLinks) {
		String footerLinkText = e.getText();
		System.out.println(footerLinkText);
	}
		
		
			

	}

}
