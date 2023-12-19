package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		By todaysImage = By.xpath("//*[@id=\"CardInstance\"]/div[2]/div/a/div/div[1]/div/img");
		
		driver.findElement(todaysImage).click();
		

	}

}
