package org.test.MavenProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Register {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\admin\\Desktop\\maven_project\\MavenProjects\\Excel\\Register.xlsx");
		//converting file to object
		FileInputStream stream=new FileInputStream(loc);
		//creating workbook object
		Workbook bk=new XSSFWorkbook(stream);
		//creating sheet object
		Sheet s=bk.getSheet("Sheet1");
		//creating row object
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				//creating cell object
				Cell c=r.getCell(j);
				//cellType 1-text,0-numbers and date format
				int type=c.getCellType();
				
				if(type==1) {
					String name=c.getStringCellValue();
					System.out.println(name);
				}
				
				if(type==0) {
					//date formate
					//if(DateUtil.isCellDateFormatted(c)) {
						Date d1=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
						String date=sdf.format(d1);
						System.out.println(date);

						double d=c.getNumericCellValue();
						//converting double to long
						long l=(long)d;
						//converting long to string
						String name=String.valueOf(l);
						System.out.println(name);
					}
								
				}
				//System.out.println(c);
			}
		}
	}
