package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyLinks {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Computers, Tablets, & Accessories']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Laptops & MacBooks']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='MacBooks']")).click();
		Thread.sleep(1000);

	}

}
