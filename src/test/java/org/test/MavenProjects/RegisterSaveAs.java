package org.test.MavenProjects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterSaveAs {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\admin\\Desktop\\maven_project\\MavenProjects\\Excel\\Register.xlsx");
		Workbook wk=new XSSFWorkbook();
		Sheet s=wk.createSheet("Sheet2");
		Row r=s.createRow(1);
		Cell c=r.createCell(0);
		c.setCellValue("maven");
		//Row r1=s.createRow(1);
		Cell c1=r.createCell(1);
		c1.setCellValue("java");
		
		FileOutputStream o=new FileOutputStream(loc);
		wk.write(o);
		System.out.println("added successfully");
	}

}
