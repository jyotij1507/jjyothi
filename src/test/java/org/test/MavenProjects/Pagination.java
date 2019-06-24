package org.test.MavenProjects;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\18619\\jjyothi\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("selenium", Keys.ENTER);
		//goToPage('4');
		moveToPage('8');
		
		
	}
	public static void goToPage(String pageNo) {
		List<WebElement> page=driver.findElements(By.xpath("//tr//td"));
		for(int i=0;i<page.size();i++) {
			String name=page.get(i).getText();
			if(name.equals(pageNo)) {
				page.get(i).findElement(By.tagName("q")).click();
				break;
			}
		}
	}
	public static void moveToPage(char pageNo) {
		String locator="//a[@aria-label='Page $']";
		locator=locator.replace('$', pageNo);
		driver.findElement(By.xpath(locator)).click();
	}

}
