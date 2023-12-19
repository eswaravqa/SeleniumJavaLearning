package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By locator = By.cssSelector("span.context-menu-one");
		rClickOptions(locator, "Copy");
		
		
	}
	
	public static void rClickOptions(By locator, String rClickOption) throws InterruptedException {

		WebElement rightClickEle = driver.findElement(locator);
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("li.context-menu-icon>span"));
		
		System.out.println(optionsList.size());
		
		for (WebElement e : optionsList) {
			String rClickOptionsText = e.getText();
			System.out.println(rClickOptionsText);
			if (rClickOptionsText.equals(rClickOption)) {
				e.click();
				Thread.sleep(1000);
		
			}
		}
		

	}

}
