package org.test.MavenProjects;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Employee {
	static WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\18619\\jjyothi\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterClass
	private void afterClass() {
		driver.close();
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@Parameters({"username","password"})
	@Test
	private void test(String s1,String s2) {
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(s1);
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(s2);
		WebElement login=driver.findElement(By.id("Log In"));
		login.click();
	}

}
