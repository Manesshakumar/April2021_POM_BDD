package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	private WebDriver driver;

	private By headerList = By.xpath("//ul[@class = 'myaccount-link-list']/li/a/span");
	private By accountHeading = By.xpath("//h1[text() = 'My account']");

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean headerDispayCheck() {
		return driver.findElement(accountHeading).isDisplayed();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public int getAccountHeaderListCount() {
		List<WebElement> accList = driver.findElements(headerList);
		System.out.println(accList.size());
		int accCount = accList.size();
		return accCount;
	}

	public List<String> getAccountHeaderList() {
		List<String> accntListText = new ArrayList<String>();
		List<WebElement> accList = driver.findElements(headerList);
		for (WebElement x : accList) {
			String text = x.getText();
			accntListText.add(text);
		}
		return accntListText;
	}

}