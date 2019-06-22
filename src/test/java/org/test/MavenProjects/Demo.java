package org.test.MavenProjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo extends Base {
	public Demo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement fname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement hobbies;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement languages;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement skills;
	
	@FindBy(xpath="//select[@id='countries']")
	private WebElement country;
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	private WebElement SelectedCountry;
	
	@FindBy(xpath="(//select[@type='text'])[3]")
	private WebElement year;
	
	@FindBy(xpath="(//select[@type='text'])[4]")
	private WebElement month;
	
	@FindBy(xpath="(//select[@type='text'])[5]")
	private WebElement day;
	
	@FindBy(id="firstpassword")
	private WebElement password;
	
	@FindBy(id="secondpassword")
	private WebElement confirmpassword;
	
	@FindBy(id="submitbtn")
	private WebElement submit;
	
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getHobbies() {
		return hobbies;
	}
	public WebElement getLanguages() {
		return languages;
	}
	public WebElement getSkills() {
		return skills;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getSelectedCountry() {
		return SelectedCountry;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	

}
