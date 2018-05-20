package com.yahoo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooMailOpen 
{
	@FindBy(id="uh-mail-link")
	private WebElement mailLink;
	
	@FindBy(xpath="//span[.='Compose']")
	private WebElement compose;
	
	@FindBy(id="to-field")
	private WebElement receiver;
	
	@FindBy(id="subject-field")
	private WebElement subject;
	
	@FindBy(id="rtetext")
	private WebElement text;
	
	@FindBy(xpath="//span[@data-action='send']")
	private WebElement sendButton;
	
	@FindBy(xpath="//b[.='Amar']")
	public WebElement ProfileSet;
	
	@FindBy(xpath="//a[@id='yucs-signout']")
	public WebElement signout;
	
	public YahooMailOpen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gotoMail() throws InterruptedException
	{
		mailLink.click();
		Thread.sleep(3000);
	}
	
	public void writeMail(String to,String sub, String msg) throws InterruptedException
	{
		compose.click();
		Thread.sleep(3000);
		receiver.sendKeys(to);
		Thread.sleep(3000);
		subject.sendKeys(sub);
		Thread.sleep(3000);
		text.sendKeys(msg);
		Thread.sleep(3000);
		sendButton.click();
	}
	
	public void mailLogout() throws InterruptedException
	{
		ProfileSet.click();
		Thread.sleep(4000);
		signout.click();
	}
}
