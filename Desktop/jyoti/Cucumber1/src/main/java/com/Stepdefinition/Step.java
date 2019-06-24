package com.Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	static WebDriver driver;
	@Given("The user is in telecom home pages")
	public void the_user_is_in_telecom_home_pages() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\jyoti\\Cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		WebElement addcust=driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]"));
		addcust.click();
	}

	@When("The user is filling the valid details")
	public void the_user_is_filling_the_valid_details() {
		WebElement radio1=driver.findElement(By.xpath("//label[@for='done']"));
		radio1.click();
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("abc");
		WebElement ename=driver.findElement(By.id("email"));
		ename.sendKeys("abc@yahoo.com");
		WebElement mess=driver.findElement(By.xpath("//textarea[@id='message']"));
		mess.sendKeys("abc");
		WebElement phone=driver.findElement(By.id("telephoneno"));
		phone.sendKeys("123");
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}

	@Then("The user should display with customer id")
	public void the_user_should_display_with_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//table/tbody/tr//td/h3")).isDisplayed());
	}

}
