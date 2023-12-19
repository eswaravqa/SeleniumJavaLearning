package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
				WebElement trgEle = driver.findElement(By.id("droppable")); 
				
				Actions act = new Actions(driver);
				//act.clickAndHold(srcEle).moveToElement(trgEle).release().build().perform();
		
				//The same above can be done in otherway
				
				act.dragAndDrop(srcEle, trgEle).perform();
		

	}

}
