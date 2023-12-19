package io.com.qa.basics.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHubWebTableCheckBox {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		clickOnCheckBoxByName("John.Smith");
		
		Thread.sleep(4000);
		List<String> colValuesList = collectUserDetails("John.Smith");
		System.out.println(colValuesList);
		
				
		////a[text()='Joe.Root']//parent::td/preceding-sibling::td/input[@type='checkbox']
	}
	
	public static void clickOnCheckBoxByName(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> collectUserDetails(String name) {
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+name+"']//parent::td/following-sibling::td"));
		List<String> colValuesList = new ArrayList<String>();
		
		for (WebElement e : userDetails) {
			String userText = e.getText();
			colValuesList.add(userText);			
		}
		return colValuesList;
	}

}
