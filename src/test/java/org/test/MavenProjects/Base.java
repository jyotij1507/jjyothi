package org.test.MavenProjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	public static void selectByText(WebElement element,String name) {
		new Select(element).selectByVisibleText(name);
	}
	public static void selectByIndex(WebElement element,int index) {
		new Select(element).selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String name) {
		new Select(element).selectByValue(name);
	}
	public static void scrollDwn(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);	
	}
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public static void quitBrowser() {
		driver.quit();
	}
}
