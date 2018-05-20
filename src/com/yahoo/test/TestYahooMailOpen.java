package com.yahoo.test;

import org.testng.annotations.Test;

import com.yahoo.generics.AutoConstants;
import com.yahoo.generics.BaseTest;
import com.yahoo.generics.ExcelLibrary;
import com.yahoo.pom.YahooLogin;
import com.yahoo.pom.YahooMailOpen;

public class TestYahooMailOpen extends BaseTest implements AutoConstants
{
	@Test
	public void mail() throws InterruptedException
	{
		String un=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 15, 0);
		String pass=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 16, 0);
		
		YahooLogin login=new YahooLogin(driver);
		login.login(un, pass);
		
		Thread.sleep(5000);
		
		YahooMailOpen open=new YahooMailOpen(driver);
		open.gotoMail();
		
		Thread.sleep(5000);
		
		String to=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 17, 0);
		String sub=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 18, 0);
		String msg=ExcelLibrary.getCellValue(AutoConstants.path, "Sheet2", 19, 0);
		
		open.writeMail(to, sub, msg);
		
		Thread.sleep(5000);
		
		open.mailLogout();
		
	}
}
