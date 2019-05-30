package org.test.MavenProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java_eclipse\\jyoti\\SelProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("jyoti");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("1234");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		driver.close();
	}

}
