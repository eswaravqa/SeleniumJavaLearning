package io.com.qa.basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWithStringLocators {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=pEPixIXYHit%252BgKcMfdqhIn8tWgBIlRh8pFbR0o52MKXyVgGg1XOygMkk0jsbGPruxBMJaX0E0Qhc2SeLFLKYuoa%252BKL7cISmod0MKPN83o85ph0jIhsxWxDArFNkSLxEWPdMu%252FPGXfX%252FnhJ%252FH9EzczKcb4gZ0tm%252FHzFQexYWlo9aP2nTnGHH0Zp3dZoXJrAMUZhoOIa6dI5wWyZkFIC8Yerdw61Li9FUqnxzZEicYP6iSudS%252BjjCi67O5hwpfbl6C3jRT0u2%252BJjJxBlH%252FBcDGnN6ZfpzmaV3SaWDmPAg%252FpMh8iRqz6YshWyhc%252BPM0oF%252BR");
		
		////Note: In SendKeys we can not send integer values. 
		//Incase if we want to send we have to convert them with value of 
		//int totalAmount = 22;
		//String totalBillAmount = String.valueOf(totalAmount);
		//driver.findElement(By.id("username")).sendKeys(totalBillAmount);
		
		//SendKeys with StringBuilder
		//StringBuilder sb =new StringBuilder("test@gmail.com");
		//driver.findElement(By.id("username")).sendKeys(sb);
		
		String email_id = "username";
		String password_id = "password";
		//String signin_btn_xpath = "//*[@id=\"signIn\"]/div/button/span/span";
		//*[@id="signIn"]/div/button/span/span
		//*[@id="signIn"]/div/button/span
		//*[@id="signIn"]/div/button/span
		
		ElementUtilities eleut = new ElementUtilities(driver);
		
		eleut.doSendKeys("id", email_id, "contacteswart@gmail.com");
		eleut.doSendKeys("id", password_id, "Balaji@12");
		
		driver.findElement(By.xpath("//*[@id=\"signIn\"]/div/button/span")).click();
		
		//eleut.doClick("xpath", signin_btn_xpath);
		
		
		
		
		
		
			
		
		
	}

}
