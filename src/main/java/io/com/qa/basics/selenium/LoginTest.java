package io.com.qa.basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String email_id = "input-email";
		String password_id = "input-password";
		String loginButton_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		
		ElementUtilities eleuti = new ElementUtilities(driver); 
		
		eleuti.doSendKeys("id", email_id, "test@gmail.com");
		eleuti.doSendKeys("id", password_id, "test@123");
		eleuti.doClick("xpath", loginButton_xpath);
	}

}
