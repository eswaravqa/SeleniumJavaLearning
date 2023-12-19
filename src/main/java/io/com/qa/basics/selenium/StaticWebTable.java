package io.com.qa.basics.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableData = driver
				.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr//following-sibling::td"));
		System.out.println(tableData.size());

		System.out.println("**Company**");
		System.out.println("--------------");

		for (int i = 0; i < tableData.size(); i++) {

			System.out.println(tableData.get(i).getText());
			i = i + 2;
		}

		System.out.println("**Contact**");
		System.out.println("--------------");
		for (int i = 1; i < tableData.size(); i++) {

			System.out.println(tableData.get(i).getText());
			i = i + 2;
		}

		System.out.println("**Country**");
		System.out.println("--------------");
		for (int i = 2; i < tableData.size(); i++) {

			System.out.println(tableData.get(i).getText());
			i = i + 2;
		}

		/*
		 * for (WebElement e : tableData) { System.out.println(e.getText()); }
		 */
		// *[@id="customers"]/tbody/tr//following-sibling::td

	}

}
