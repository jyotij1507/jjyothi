package org.test.MavenProjects;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Country {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\maven_project\\MavenProjects\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		//finding the table rows
		List<WebElement> tRow=driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			WebElement row=tRow.get(4);
		//finding the table data
				List<WebElement> tData=driver.findElements(By.tagName("td"));
				for (int j = 0; j < tData.size(); j++) {
					WebElement column=tData.get(j);
					String name=column.getText();
					if(name.equals("china"));
					{
					System.out.println(name);
					}
				}
				System.out.println(row);
		}
	}
}
		
	


