package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketCompleteMenu {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		By shopByCategoryLocator = By.xpath("(//span[text()='Shop by'])[2]");
		
		
	}

}
