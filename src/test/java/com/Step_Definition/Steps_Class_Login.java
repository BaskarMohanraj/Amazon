package com.Step_Definition;

import com.Pages_Class.Pages_Class_Login;
import com.Reusable.Reusable_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps_Class_Login extends Reusable_Class  {
	
	public static Pages_Class_Login pgs;
	
	@Given("To Launch the Browser")
	public void to_launch_the_browser() {

		BrowserLaunch();
	}

	@When("To click Profile")
	public void to_click_profile() {
		
		pgs = new Pages_Class_Login(driver);
		
		Toclick(pgs.getLogin());
	}

	@When("To click and enter Mob no")
	public void to_click_and_enter_mob_no() {
		
		Toclick(pgs.getPhno());
		Enterval(pgs.getPhno(), "7904882133");
	}

	@When("To click continue")
	public void to_click_continue() {
		
		Toclick(pgs.getEnt());
	}

	@When("To click and enter password")
	public void to_click_and_enter_password() {
	   
		Toclick(pgs.getPass());
		Enterval(pgs.getPass(), "Dikshi@aug19");
	}

	@When("To click submit")
	public void to_click_submit() {
		
		Toclick(pgs.getSubmit());
	}


}
