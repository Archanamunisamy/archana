package org.Base;


import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpojo extends BaseClass {

//non parameterized constructor
	public Fbloginpojo() {
		PageFactory.initElements(driver, this);

	}

	// private WebElements
	// WebElement email = driver.findElement(By.id"email"));
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbutton;

	//getters to access WebElements outside the class
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	

}
