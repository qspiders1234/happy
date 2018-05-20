package com.yahoo.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstants
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void open()
	{
		driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException  
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
}
