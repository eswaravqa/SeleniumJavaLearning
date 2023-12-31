package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.thebay.com/");
		
		Actions act = new Actions(driver);
		By mensMenu = By.xpath("//a[@href='/c/men']");
		WebElement mensMenuElement = driver.findElement(mensMenu);
		
		act.moveToElement(mensMenuElement).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/c/men/mens-clothing/jeans']")).click();
		
	
		
		//a[@href='/c/men']
	
		
		
		
		

	}

}
