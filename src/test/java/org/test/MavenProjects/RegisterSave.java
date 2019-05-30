package org.test.MavenProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterSave {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\admin\\Desktop\\maven_project\\MavenProjects\\Excel\\Register.xlsx");
		//converting file to object
		FileInputStream stream=new FileInputStream(loc);
		//creating workbook object
		Workbook bk=new XSSFWorkbook(stream);
		//creating sheet object
		Sheet s=bk.getSheet("Sheet1");
		//creating row object
		Row r=s.getRow(2);
		//creating cell object
		Cell c=r.getCell(2);
		String name=c.getStringCellValue();
		if(name.equals("medavakam")) {
			c.setCellValue("sholingnalur");
		}
		//writing to already existing file
		FileOutputStream stream1=new FileOutputStream(loc);
		//writing in workkbook
		bk.write(stream1);
		System.out.println("done successfully");
	}

}
