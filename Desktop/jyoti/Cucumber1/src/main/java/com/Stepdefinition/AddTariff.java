package com.Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	
	static WebDriver driver;

	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\jyoti\\Cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}
	@Given("The user click on add tariff plan")
	public void the_user_click_on_add_tariff_plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user is filling the valid detail{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_is_filling_the_valid_detail(String A, String B, String C, String D, String E, String F, String G) {	
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(A);
		driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(B);
		driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(C);
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(D);
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(E);
		driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(F);
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(G);
	}
	
	@When("The user click on submit buttons")
	public void the_user_click_on_submit_buttons() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The user should display congratulations you added tariff successfully.")
	public void the_user_should_display_congratulations_you_added_tariff_successfully() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

}
