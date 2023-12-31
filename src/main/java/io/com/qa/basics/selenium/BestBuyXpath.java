package io.com.qa.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclint.Messages.Group;

public class BestBuyXpath {

	public static WebDriver driver;

	public static void main(String[] args) {
		// Ohm Shri Rama | Avighnamasthu

		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/en-ca");

		// Task#1: Click on cart verify cart page is launch successfully
		//// span[@class='label']
		// your cart message //h1[@class='title_3A6Uh']

		/*
		 * By cartLocator = By.xpath("//span[@class='label']"); WebElement cart =
		 * driver.findElement(cartLocator); cart.click();
		 * 
		 * By cartMessageLocator = By.xpath("//h1[text()='Your Cart']"); WebElement
		 * cartMessage = driver.findElement(cartMessageLocator);
		 * 
		 * if (cartMessage.isDisplayed()) {
		 * System.out.println("Cart link on home page is clicked successfully "); }
		 */

		// Task#2:Click on Account link

		/*
		 * By accountLinkLocator = By.xpath("//span[@data-automation='sign-in-text']");
		 * 
		 * WebElement accountLink = driver.findElement(accountLinkLocator);
		 * accountLink.click(); try { Thread.sleep(2000); } catch (InterruptedException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * //By Locators By emailLocator =
		 * By.xpath("//input[@type='email' and @name='username']"); By passwordLocator =
		 * By.xpath("//input[@type='password' and @name='password']"); By signInLocator
		 * = By.xpath("(//span[text()='Sign In'])[2]");
		 * 
		 * //Above way of xpath expression is called capture group //When xpath is
		 * surrounded with braces () it is called capture Group //It is used for
		 * indexing purpose
		 * 
		 * //WebElements WebElement email = driver.findElement(emailLocator); WebElement
		 * password = driver.findElement(passwordLocator); WebElement signIn =
		 * driver.findElement(signInLocator);
		 * 
		 * //Actions email.sendKeys("govinda@gmail.com"); password.sendKeys("test12");
		 * signIn.click();
		 */

		// Task#3: find total no of links on the home page

		int totalNumberOfLinksOnHomePage = (driver.findElements(By.xpath("//a"))).size();

		System.out.println(totalNumberOfLinksOnHomePage);

		// Task#4: find total no of images on the home page

		int totalNumberOfImagesOnHomePage = (driver.findElements(By.xpath("//img"))).size();

		System.out.println(totalNumberOfImagesOnHomePage);
		
		//Task#5: Click on Shop menu, get all sub menu items as a list
		By shopLocator = By.xpath("//span[text()='Shop']");
		By shopSubMenuItemsLocator =  By.xpath("(//div[@class='menu_3LP5u menuActive_3neTn']//a)");
		
		WebElement shop = driver.findElement(shopLocator);
		
		shop.click();
		
		List<WebElement> shopSubMenuItems = driver.findElements(shopSubMenuItemsLocator);
		
		for (WebElement e: shopSubMenuItems) {
			System.out.println(e.getText());
		}
		
		
		
		//form[@id='form-currency']//ul[@class='dropdown-menu']//button

		//Meaning: Jumpt to form, jump to ul then jump to button and find all buttons 
		
		//span[text()='Shop']
		//div[@class='menu_3LP5u menuActive_3neTn']//a

	}

}
