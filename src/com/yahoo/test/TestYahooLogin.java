package com.yahoo.test;

import org.testng.annotations.Test;

import com.yahoo.generics.AutoConstants;
import com.yahoo.generics.BaseTest;
import com.yahoo.generics.ExcelLibrary;
import com.yahoo.pom.YahooLogin;

public class TestYahooLogin extends BaseTest implements AutoConstants
{
	@Test
	public void log() throws InterruptedException
	{
		String un=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 15, 0);
		String pass=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 16, 0);
		
		YahooLogin login=new YahooLogin(driver);
		login.login(un, pass);
		
		
		Thread.sleep(7000);
		
		login.logout();
	}
}
