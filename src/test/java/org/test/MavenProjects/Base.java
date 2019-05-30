package org.test.MavenProjects;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
			
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java_eclipse\\jyoti\\SelProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void btnLogin(WebElement element) {
		element.click();
	}
	public static void scrollDwn(WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	public static void scrollUp(WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}
	public static void quitBrowser() {
		driver.quit();
	}


}
