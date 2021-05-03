package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By loginBtn = By.id("SubmitLogin");
    private By forgottenpwd = By.xpath("//a[text() = 'Forgot your password?']");
    
    
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    public String getTitle() {
    	return driver.getTitle();
    }
    
    public boolean forgottenPwdLinkExist() {
    	return driver.findElement(forgottenpwd).isDisplayed();
    }
    
    public void getUsername(String username) {
    	driver.findElement(emailId).sendKeys(username);
    }
    public void getPassword(String Password) {
    	driver.findElement(password).sendKeys(Password);
    }
    
    public void doClick() {
    	driver.findElement(loginBtn).click();
    }
    
    public MyAccountPage doLogin(String username,String Password) {
    	driver.findElement(emailId).sendKeys(username);
    	driver.findElement(password).sendKeys(Password);
    	driver.findElement(loginBtn).click();
    	return new MyAccountPage(driver);
    }
}
