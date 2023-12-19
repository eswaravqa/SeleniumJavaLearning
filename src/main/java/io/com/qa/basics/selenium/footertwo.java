package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footertwo {

		static WebDriver driver;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		By link_xpath = By.xpath("//footer//a");
		
		System.out.println("Number of footer links: " + doGetFooterLinkCount(link_xpath));
		
		doGetFooterLinkText(link_xpath);
		
		
	}
	
	public static int doGetFooterLinkCount(By locator) {
	List<WebElement> footerLink = driver.findElements(locator);
		
		int footerLinkCount = footerLink.size();
		return footerLinkCount;
	}
	
	public static void doGetFooterLinkText(By locator) {
		List<WebElement> footerLinkElement = driver.findElements(locator);
		for(WebElement e : footerLinkElement) {
			String footerLinkText = e.getText();
			String footerLink = e.getAttribute("href");
			System.out.println(footerLinkText + "====" + footerLink);
		}
	}

}
