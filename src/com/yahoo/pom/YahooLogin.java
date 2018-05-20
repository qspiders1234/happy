package com.yahoo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLogin 
{
	@FindBy(id="uh-signin")
	private WebElement signInLink;
	
	@FindBy(id="login-username")
	private WebElement usernamefield;
	
	@FindBy(id="login-signin")
	private WebElement nextLink;
	
	@FindBy(id="login-passwd")
	private WebElement passwordField;
	
	@FindBy(id="login-signin")
	private WebElement signin;
	
	@FindBy(xpath="//span[.='Amar']")
	private WebElement profile;
	
	@FindBy(id="uh-signout")
	private WebElement signout;
	
	
	Actions act;
	public YahooLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	
	public void login(String un,String pass) throws InterruptedException
	{
		signInLink.click();
		Thread.sleep(3000);
		usernamefield.click();
		Thread.sleep(3000);
		usernamefield.clear();
		Thread.sleep(3000);
		usernamefield.sendKeys(un);
		Thread.sleep(3000);
		nextLink.click();
		Thread.sleep(3000);
		passwordField.sendKeys(pass);
		Thread.sleep(3000);
		signin.click();
		Thread.sleep(3000);
		act.moveToElement(profile).perform();
		
	}
	
	public void logout() throws InterruptedException
	{
		act.moveToElement(profile).perform();
		Thread.sleep(3000);
		act.click(signout).perform();
	}
}
