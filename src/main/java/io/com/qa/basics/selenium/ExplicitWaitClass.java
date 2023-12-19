package io.com.qa.basics.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By aboutUsLink = By.linkText("About Us");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		
		waitForPresenceOfElement(emailId, 5).sendKeys("test@gmail.com");
		
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginButton).click();		
		
		waitForPresenceOfElement(aboutUsLink, 10).click();
				

	}
	
	/**
	 * Description: An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.

	 * @param locator
	 * @param timeOut
	 * @return WebElement
	 */
	public static WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}


	/**
	 * Description: An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return WebElement
	 */
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
	}
	
	/**
	 * Description: An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForVisibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			
	}
	
	/**
	 * Description: An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static List<WebElement> waitForPresenceOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			
	}
	
	
	
	/**
	 * Description: Wait for visibility of element and then click action.
	 * @param locator
	 * @param timeOut
	 */
	public static void doClickWithWait(By locator, int timeOut) {
		waitForVisibilityOfElement(locator, timeOut).click();
	}
	
	/**
	 * Description: Wait for visibility of element and then sendKeys
	 * @param locator
	 * @param timeOut
	 * @param text
	 */
	public static void doSendKeysWithWait(By locator, int timeOut, String text ) {
		waitForVisibilityOfElement(locator, timeOut).sendKeys(text);
	}
	
	

}
