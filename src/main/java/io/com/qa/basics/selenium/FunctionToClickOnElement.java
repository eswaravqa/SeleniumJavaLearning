package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionToClickOnElement {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://google.co.in");

		By LangLinks = By.xpath("//div[@id='SIvCob']/a");
		//ClickOnElement(LangLinks, "Français");
		driver.findElement(LangLinks).click();

	}

	

}
