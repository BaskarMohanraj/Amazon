package com.Pages_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Reusable.Reusable_Class;

import io.cucumber.java.en.When;

public class Pages_Class_SignUp extends Reusable_Class {
	
	public Pages_Class_SignUp(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
			}
	
	@FindBy (xpath = "//span[text()='Account & Lists']")
	WebElement profile;
	
	@FindBy (xpath = "(//a[text()='Start here.'])[1]")
	WebElement newcustomer;
	
	@FindBy(id = "ap_customer_name")
	WebElement custname;
	
	@FindBy(id = "ap_phone_number")
	WebElement phone;
	
	@FindBy(id = "ap_password")
	WebElement pass;
	
	@FindBy(id = "continue")
	WebElement contin;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getContin() {
		return contin;
	}

	
}
