package com.stepDefLayer;

import com.baseLayer.BaseClass;
import com.pageLayer.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageStepDef extends BaseClass {

	protected static HomePage home;
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	   
		home= new HomePage();
	}

	@When("User create new label")
	public void user_create_new_label() {
	    home.clickOnCreateLabel();
	    home.createNewLabel("Label1");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User rename the label")
	public void user_rename_the_label() {
	
		home.editLabel();
		home.clearLabel();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		home.renameLabel("Label2");
		
	}

	@Then("User will validate the lable name")
	public void user_will_validate_the_lable_name() {
	    
		Assert.assertEquals(home.verifyLabel(),"Label2");
		System.out.println(home.verifyLabel());
		BaseClass.tearDown();
		
	}

}
