package org.test.MavenProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\admin\\Desktop\\18619\\jjyothi\\driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 WebElement book=driver.findElement(By.id("twotabsearchtextbox"));
		 book.sendKeys("books");
		 WebElement srch=driver.findElement(By.xpath("//input[@type='submit']"));
		 srch.click();
		 List<WebElement> books = driver.findElements(By.xpath("//div[@class='sg-col-inner']/div/h2"));
		 for (int i = 0; i < books.size(); i++) {
			 String name=books.get(i).getText();
			 System.out.println(name);
			
		}
	}

}
