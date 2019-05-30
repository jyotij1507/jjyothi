package org.test.MavenProjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage extends Base {
	public static void main(String[] args) {
		WebDriver driver=getDriver();
		loadUrl("https://www.facebook.com/");
		WebElement scroll2=driver.findElement(By.xpath("//div[@id='reg_pages_msg']"));
		
		WebElement txtUserName=driver.findElement(By.id("email"));
		type(txtUserName,"Java");
		WebElement txtPassword=driver.findElement(By.id("pass"));
		type(txtPassword,"java");
		//WebElement scroll2=driver.findElement(By.xpath("//div[@class='clearfix loggedout_menubar']"));
		
		scrollDwn(scroll2);
		//scrollUp(scroll2);
		WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
		btnLogin(loginBtn);
		quitBrowser();
	}

}
