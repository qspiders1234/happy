package com.yahoo.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary 
{
	public static String getCellValue(String path, String sheet, int r, int c)
	{
		String cellValue="";
		try
		{
			FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\Aj.xlsx");
			Workbook wb=new XSSFWorkbook(fis);			
			cellValue=wb.getSheet(sheet).getRow(r).getCell(c).toString();			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		return cellValue;
	}	
	public static int getRowCount(String path, String sheet)
	{
		int rowCount=0;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\Aj.xlsx");
			Workbook wb= new XSSFWorkbook(fis);			
			rowCount=wb.getSheet(sheet).getLastRowNum();			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		return rowCount;
	}
	public static int getCellCount(String path, String sheet, int r)
	{
		int cellCount=0;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\Aj.xlsx");
			Workbook wb=new XSSFWorkbook(fis);			
			cellCount=wb.getSheet(sheet).getRow(r).getLastCellNum();			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		return cellCount;
	}
}
