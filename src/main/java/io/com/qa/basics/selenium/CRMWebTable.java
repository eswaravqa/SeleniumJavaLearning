package io.com.qa.basics.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMWebTable {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		//On CRM website xpath to get company column text 
		//table[@class='datacard']//a[text()='Anne Nal']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//table[@class='datacard']//a[text()='Anusha N']/parent::td//following-sibling::td/a[@context='company']
		
		checkBoxByUserName("Anne Nal");
		checkBoxByUserName("David Rodriguez");
		
		String companyName = getCompanyByUserName("Anne Nal");
		System.out.println(companyName);
		
		String companyName2 = getCompanyByUserName("David Rodriguez");
		System.out.println(companyName2);
		
		String eMail = getEmail("Andrew Charles");
		System.out.println(eMail);
		
		getPhoneNumbers("Andrew Charles");
		
		
	}
	
	public static void checkBoxByUserName(String userName){
		
		driver.findElement(By.xpath("//table[@class='datacard']//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
				
	}
	
	public static String getCompanyByUserName(String userName) {
		return driver.findElement(By.xpath("//table[@class='datacard']//a[text()='"+userName+"']/parent::td//following-sibling::td/a[@context='company']")).getText();
	}
	
	public static String getEmail(String userName) {
		
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//following-sibling::td//a[contains(@href, 'mailto')]")).getText();
		
	}
	
	public static void getPhoneNumbers(String userName) {
		List<WebElement> phoneNumbers = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td//following-sibling::td/span[@context='phone']"));
		
		for (WebElement e : phoneNumbers) {
			
		String	phNum = e.getText();
			
			System.out.println(phNum);
			
			
		}
	}

}

