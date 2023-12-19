package io.com.qa.basics.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilities {

	private WebDriver driver;

	public ElementUtilities(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorValue) {

		By by = null;

		switch (locatorType.toLowerCase().trim()) {
		case "id":
			by = By.id(locatorValue);
			break;
		case "name":
			by = By.name(locatorValue);
			break;
		case "class":
			by = By.className(locatorValue);
			break;
		case "xpath":
			by = By.xpath(locatorValue);
			break;
		case "css":
			by = By.cssSelector(locatorValue);
			break;
		case "linktext":
			by = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			by = By.partialLinkText(locatorValue);
			break;
		case "tag":
			by = By.tagName(locatorValue);
			break;

		default:
			System.out.println("Wrong locator type is passed: " + locatorType);
			throw new CustomException("WRONG LOCATOR TYPE");

		}
		return by;
	}

	//Methods by locators
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// Methods String locators

	public String doElementGetText(String locatorType, String locatorValue) {
		return getElement(locatorType, locatorValue).getText();
	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public String getElementAttribute(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);	
	}

	public void doClick(String locatorType, String locatorValue) {
		getElement(locatorType, locatorValue).click();
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}
	
	public List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//Write a Function: To capture the text of all the page links and return List<String>
	public List<String> getElementsTextList(By locator){
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e: eleList) {
			String text = e.getText();
			
			if (text.length() !=0) {
				eleTextList.add(text);
				
			}
		}
		return eleTextList;
	}
	
	//Write a function capture specific attribute from the list 
	
	/**
	 * Description: 
	 * @param locator
	 * @param attributeName
	 */
	public void getElementsAttributeList(By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttributeList = new ArrayList<String>();
		
		for (WebElement e: eleList) {
			String attributeValue = e.getAttribute(attributeName);
			eleAttributeList.add(attributeValue);
			
		}
		
	}
	
	//Write a function to capture all language elements in a page 
	//and click if a particular element is found 
	
	public void ClickOnElement(By locator, String eleText) {
		List<WebElement> LangLinks = driver.findElements(locator);

		System.out.println(LangLinks.size());

		for (WebElement e : LangLinks) {
			String Language = e.getText();
			System.out.println(Language);
			if (Language.contains(eleText)) {
				e.click();
				break;
			}
		}

	}
	
	//*****************Select Drop Down Utilities*****************
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);			
	}
	
	public void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	//Total number of drop down items
	public int numberOfDropDownItems(By locator) {
		Select select = new Select(getElement(locator));		
		return select.getOptions().size();
	}
	
	//returns list of dropdown options in List<String>
	public List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();	
		List<String> optionsTextList = new ArrayList<String>();
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	//To choose a drop down option without using visible text,  index and value options 
	public  void doSelectDropDownOptions(By locator, String country) {	
		
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
	
	//**********************Wait Utilities*******************
	
	/**
	 * Description: An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.

	 * @param locator
	 * @param timeOut
	 * @return WebElement
	 */
	public WebElement waitForPresenceOfElement(By locator, int timeOut) {
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
	
	public WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
	}
	
	/**
	 * Description: Wait for visibility of element and then click action.
	 * @param locator
	 * @param timeOut
	 */
	public void doClickWithWait(By locator, int timeOut) {
		waitForVisibilityOfElement(locator, timeOut).click();
	}
	
	/**
	 * Description: Wait for visibility of element and then sendKeys
	 * @param locator
	 * @param timeOut
	 * @param text
	 */
	public void doSendKeysWithWait(By locator, int timeOut, String text ) {
		waitForVisibilityOfElement(locator, timeOut).sendKeys(text);
	}
	
	/**
	 * Description: An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForVisibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			
	}
	
	/**
	 * Description: An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForPresenceOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			
	}
	
	// *******************Action Utilities************************
	
	/**
	 * Description: Hover on Parent Menu and click on Child menu. Method works for single Parent Child. 
	 * @param parentMenuLoc
	 * @param childMenuLoc
	 * @throws InterruptedException
	 */
	public void twoLevelMenuHandle(By parentMenuLoc, By childMenuLoc) throws InterruptedException {
		
		Actions act = new Actions (driver);		
		act.moveToElement(getElement(parentMenuLoc)).perform();
		Thread.sleep(2000);
		doClick(childMenuLoc);
		
	}
	
	/**
	 * Description: Method works on multiple child locator on parent menu and Parent Menu needs a click.
	 * @param parentMenuLoc
	 * @param firstChildMenuLoc
	 * @param secondChildMenuLoc
	 * @param thirdChildMenuLoc
	 * @throws InterruptedException
	 */
	public void threeLevelMenuHandle(By parentMenuLoc, By firstChildMenuLoc, By secondChildMenuLoc,
			By thirdChildMenuLoc) throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		getElement(parentMenuLoc).click();
		Thread.sleep(1000);	
		act.moveToElement(getElement(firstChildMenuLoc)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(secondChildMenuLoc)).perform();
		Thread.sleep(1000);
		getElement(thirdChildMenuLoc).click();			
		
	}
	
	/**
	 * Description: SendKeys with Actions class
	 * @param locator
	 * @param value
	 */
	public void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	/**
	 * Description: click with Actions class
	 * @param locator
	 */
	public void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	
}
