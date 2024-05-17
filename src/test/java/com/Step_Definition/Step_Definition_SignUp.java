package com.Step_Definition;

import com.Pages_Class.Pages_Class_SignUp;
import com.Reusable.Reusable_Class;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.When;

public class Step_Definition_SignUp extends Reusable_Class {
	
	public Pages_Class_SignUp pgs;
	
	@When("move to Profile")
	public void move_to_profile() {
	
		pgs = new Pages_Class_SignUp(driver);
		MouseHover(pgs.getProfile());
		
		
	}

	@When("select New Customer")
	public void select_new_customer() {
		
		Toclick(pgs.getNewcustomer());
		
	}

	@When("valid Personal details")
	public void valid_personal_details() {
		Toclick(pgs.getCustname());
		Enterval(pgs.getCustname(), "Baskar");
		Toclick(pgs.getPhone());
		Enterval(pgs.getPhone(), "7972898853");
		Toclick(pgs.getPass());
		Enterval(pgs.getPass(), "Dikshi@aug19");
				
	}

	@When("verify mobile number")
	public void verify_mobile_number() {
		
		Toclick(pgs.getContin());
		
	}


}
