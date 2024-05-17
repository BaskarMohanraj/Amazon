package com.Pages_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Reusable.Reusable_Class;

public class Pages_Class_Login extends Reusable_Class {
	
	public Pages_Class_Login(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
				
		
	}
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	WebElement login;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement phno;
	
	@FindBy(id = "continue")
	WebElement ent;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement pass;
	
	@FindBy(id = "signInSubmit")
	WebElement submit;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getEnt() {
		return ent;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
