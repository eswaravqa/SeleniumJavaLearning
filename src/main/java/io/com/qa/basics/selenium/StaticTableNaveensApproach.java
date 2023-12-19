package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableNaveensApproach {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
			
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		
		//Xpath pattern for Company column -- also called webtable traversing
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for (int r=2; r<=rowCount; r++) {
			String actualXpath = beforeXpath+r+afterXpath;
			String company = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(company);
		}

	}

}
