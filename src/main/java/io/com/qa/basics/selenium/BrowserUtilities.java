package io.com.qa.basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author contacteswar
 * Description: Generic Browser Utilities to perform operations on Browser 
 * 
 * 
 * 
 */
public class BrowserUtilities {

	private WebDriver driver;
	
	/**
	 * Purpose: Launch the selected Browser
	 * @param browser
	 * @return - driver instance 
	 */
	public WebDriver launchBrowser(String browser) {

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass correct browser name....");
			throw new CustomException("INVALID BROWSER");

		}
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL is null");
			throw new CustomException("URL IS NULL");
		}
		
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new CustomException("HTTP IS MISSIN IN URL");
		}
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public boolean getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if (pageSource.contains(value)) {
			return true;
		}
		return false;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	

}



