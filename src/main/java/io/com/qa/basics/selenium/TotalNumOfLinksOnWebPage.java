package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.formats.html.markup.Links;

public class TotalNumOfLinksOnWebPage {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		//Display all links
		//List<WebElement> Links = driver.findElements(By.tagName("a"));
		// System.out.println(Links.size());

		/*for (WebElement e : Links) {
			String linkText = e.getText();
			if (linkText.length() != 0) {
				System.out.println(linkText + "-----" + e.getAttribute("href") );
				
			}
		}*/

		// System.out.println(doGetTotalNumOfLinksOnWebPage());
		
		//Display all images and get alt and src attributes 
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());
		
		
		for (WebElement s : img) {
			
			String altValue = s.getAttribute("alt");
			String srcValue = s.getAttribute("src");
			System.out.println(altValue + "----" + srcValue);
		

	}

	/*
	 * public static int doGetTotalNumOfLinksOnWebPage() { List<WebElement> links =
	 * driver.findElements(By.tagName("a")); int totalNumOfLinks = links.size();
	 * return totalNumOfLinks; }
	 * 
	 */
		
		
		
		
}
	
}
