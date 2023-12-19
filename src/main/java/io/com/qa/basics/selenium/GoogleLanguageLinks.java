package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	

public class GoogleLanguageLinks {

	static WebDriver driver;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://google.co.in");
		 
		 List<WebElement> LangLink =  driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		 
		 System.out.println(LangLink.size());
		 
		 for (WebElement e : LangLink) {
			 String Language = e.getText();
			 System.out.println(Language);
		 }

	}

}
