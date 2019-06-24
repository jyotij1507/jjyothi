package org.test.MavenProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DemoMain extends Base{
	public static void main(String[] args) throws IOException {
		getDriver();
		loadUrl("http://demo.automationtesting.in/Register.html");
		Demo d=new Demo();
		type(d.getFname(), "swathi");
		type(d.getLname(), "kattapa");
		type(d.getAddress(), "mcn nagar extension,thoraipakkam");
		type(d.getEmail(), "swathi123@gmail.com");
		type(d.getPhone(), "23455668901");
		btnLogin(d.getGender());
		btnLogin(d.getHobbies());
		//Select  s=new Select(d.getLanguages());
		//selectByText(d.getLanguages(), "Arabic");
		type(d.getYear(), "2019");
		type(d.getMonth(), "january");
		type(d.getDay(), "19");
		type(d.getPassword(), "swathi");
		type(d.getConfirmpassword(), "swathi");
		btnLogin(d.getSubmit());
		File loc=new File("C:\\Users\\admin\\Desktop\\18619\\jjyothi\\Excel\\Demo1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook bk=new XSSFWorkbook(stream);
		Sheet s=bk.getSheet("Sheet1");
		Row r=s.createRow(1);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			
		}
		
		
			
			
			
		}
		
		
	}


