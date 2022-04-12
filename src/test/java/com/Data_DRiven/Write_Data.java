package com.Data_DRiven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Manjupriya pc\\Documents\\Write_data.xlsx");
		FileInputStream fip = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fip);
		//Sheet s= wb.createSheet("User_Data");
		//Row r=s.createRow(0);
		//Cell c= r.createCell(0);
		//c.setCellValue("Email");
		wb.createSheet("User_Data2").createRow(0).createCell(0).setCellValue("email");
		wb.getSheet("User_Data2").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("User_Data2").createRow(1).createCell(0).setCellValue("shalu");
		wb.getSheet("User_Data2").getRow(1).createCell(1).setCellValue("shalu20");
		FileOutputStream fop = new FileOutputStream(f);
		wb.write(fop);
		wb.close();
		System.out.println("Write Successfully");
		
	}

}
