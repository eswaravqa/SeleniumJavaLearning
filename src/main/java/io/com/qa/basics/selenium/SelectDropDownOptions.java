package io.com.qa.basics.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();	
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By locator = By.id("Form_getForm_Country");
		
		/*
		 * WebElement country_ele = driver.findElement(locator);
		 * 
		 * Select select = new Select(country_ele);
		 * 
		 * List<WebElement> countryDropDownOptions = select.getOptions();
		 * 
		 * //How to get total number of drop down options? //-- .getOptions() gives
		 * total number of dropdown options
		 * System.out.println(select.getOptions().size());
		 * 
		 * for(WebElement e : countryDropDownOptions) { String country = e.getText();
		 * System.out.println(country);
		 * 
		 * if(country.equalsIgnoreCase("Vietnam")) { e.click(); break; } }
		 */
		
		doSelectDropDownOptions(locator, "Uruguay");
		numberOfDropDownItems(locator);
		
		
		getDropDownOptions(locator);
		
		//Test Case1: Check if dropdown has a specific country 
		
		if(getDropDownOptions(locator).contains("Uganda")) {
			System.out.println("Uganada is available in the drop down list -- Test PASSS");
		}
		
		ArrayList<String> expectedCountries = new ArrayList<>(Arrays.asList("Turkey", "Uruguay", "Taiwan"));
		
		//Test Case2: Check if dropdown has a set of countries 
		if(getDropDownOptions(locator).containsAll(expectedCountries)) {
			System.out.println("Expected Countries List matches Actual Countries List");
		}
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void numberOfDropDownItems(By locator) {
		Select select = new Select(getElement(locator));		
		System.out.println(select.getOptions().size());
	}
	
	public static List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();	
		List<String> optionsTextList = new ArrayList<String>();
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public static void doSelectDropDownOptions(By locator, String country) {	
		
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();			
	
		System.out.println(select.getOptions().size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(country)) {
				e.click();
				break;
			}
		}
	}

}
