package com.Step_Definition;

import java.awt.AWTException;

import com.Pages_Class.Pages_Class_SearchItems;
import com.Reusable.Reusable_Class;

import io.cucumber.java.en.When;

public class Step_Class_SearchItems extends Reusable_Class {
	
	public Pages_Class_SearchItems pgs;

	@When("To select search Field")
	public void to_select_search_field() {
		
		pgs = new Pages_Class_SearchItems(driver);
		
		Toclick(pgs.getSearch());
		
				
	}

	@When("To enter Laptops for search")
	public void to_enter_laptops_for_search() throws AWTException {
		
		Enterval(pgs.getSearch(), "Laptops");
		toEnter();
	    
		
	}


}
