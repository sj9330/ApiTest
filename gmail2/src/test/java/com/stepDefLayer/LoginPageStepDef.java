package com.stepDefLayer;

import com.baseLayer.BaseClass;
import com.pageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass{

	protected static LoginPage login;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    
		BaseClass.initialization();
	}

	@When("User enter emailid and click on Next button")
	public void user_enter_emailid_and_click_on_next_button() {
	   	login= new LoginPage();
		login.typeEmailIdAndClickOnNext(prop.getProperty("emailid"));
		
	}
	
	@When("User enter password")
	public void user_enter_password() {
	    
		login.typePassword(prop.getProperty("password"));
		
	}

	@Then("USer click on Next button")
	public void u_ser_click_on_next_button() {
	   
		login.clickOnNext();
		
	}
	
	
}
