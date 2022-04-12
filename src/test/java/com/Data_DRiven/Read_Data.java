package com.Data_DRiven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void particular_Cell_data() throws IOException
	{
		File f= new File("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Demo.xlsx");
		FileInputStream fp = new FileInputStream(f); 
		Workbook wb= new XSSFWorkbook(fp);
		Sheet s= wb.getSheetAt(0);
		Row r= s.getRow(1);
		Cell c=r.getCell(1);
		CellType type=c.getCellType();
		if(type.equals(CellType.STRING))
		{
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		else if(type.equals(CellType.NUMERIC))
		{
			double value= c.getNumericCellValue();
			System.out.println(value);
		}
		
	wb.close();
	}
	public static void All_Data() throws IOException 
	{
		File f= new File("C:\\\\Users\\\\Manjupriya pc\\\\eclipse-workspace\\\\Maven_Demo\\\\Test_cases\\\\Demo.xlsx");
		FileInputStream fip= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fip);
		Sheet s= wb.getSheetAt(0);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r= s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c= r.getCell(j);
				CellType type= c.getCellType();
				if(type.equals(CellType.STRING))
				{
					String value= c.getStringCellValue();
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC))
				{
					double value= c.getNumericCellValue();
					int v=(int) value;
					String st= Integer.toString(v);
					System.out.println(st);
				}
			}
		}
		wb.close();
	}
	public static void Particular_Rowdata() throws IOException 
	{
		File f= new File("C:\\\\Users\\\\Manjupriya pc\\\\eclipse-workspace\\\\Maven_Demo\\\\Test_cases\\\\Demo.xlsx");
		FileInputStream fip= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fip);
		Sheet s= wb.getSheetAt(0);
		Row r= s.getRow(3);
		for(int i=0;i<r.getPhysicalNumberOfCells();i++)
		{
				Cell c= r.getCell(i);
				CellType type= c.getCellType();
				if(type.equals(CellType.STRING))
				{
					String value= c.getStringCellValue();
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC))
				{
					double value= c.getNumericCellValue();
					int v=(int) value;
					String st= Integer.toString(v);
					System.out.println(st);
				}
			}
		
		wb.close();
	}
	public static void Particular_Columndata() throws IOException 
	{
		File f= new File("C:\\\\Users\\\\Manjupriya pc\\\\eclipse-workspace\\\\Maven_Demo\\\\Test_cases\\\\Demo.xlsx");
		FileInputStream fip= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fip);
		Sheet s= wb.getSheetAt(0);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r= s.getRow(i);	
			Cell c= r.getCell(1);
				CellType type= c.getCellType();
				if(type.equals(CellType.STRING))
				{
					String value= c.getStringCellValue();
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC))
				{
					double value= c.getNumericCellValue();
					int v=(int) value;
					String st= Integer.toString(v);
					System.out.println(st);
				}
			}
		
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("The Particular cell datas are    :");
		particular_Cell_data();
		System.out.println("All datas are    :");
		All_Data();
		System.out.println("The Particular Row datas are    :");
		Particular_Rowdata();
		System.out.println("The Particular Column datas are    :");
		Particular_Columndata();
	}
}
