package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By footerLinks = By.xpath("//footer//a");
		
		List<WebElement> footerLinkList = driver.findElements(footerLinks);
		
		System.out.println(footerLinkList.size());
		
		for (WebElement e : footerLinkList )
		{
			String footerText = e.getText();
			System.out.println(footerText);
		}
		
		
	}

}
