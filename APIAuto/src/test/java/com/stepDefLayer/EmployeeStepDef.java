package com.stepDefLayer;

import com.baseAPILayer.BaseAPI;
import com.resourseLayer.EmployeeTestData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class EmployeeStepDef {
	
	private static BaseAPI base;
	private static RequestSpecification httpRequest;
	private static Response resp;
	private static Response resp2;

	private String reqbody;
	private String reqbody2;

	

	@Given("add new employee with help of name and job")
	public void add_new_employee_with_help_of_name_and_job() throws Exception {
	   
		base= new BaseAPI();
		httpRequest=base.baseAPIPreconditon();
		
		EmployeeTestData emp= new EmployeeTestData();
		String reqbody= emp.createNewEmployee("admin", "admin");
		httpRequest.body(reqbody);

	}

	@When("user hit post request to create new employee")
	public void user_hit_post_request_to_create_new_employee() {
		
		resp=httpRequest.post("/employees");
	
		}
	/*
	 @When("user add new employee with help of name and job")
	public void add_new_employee_with_help_of_name_and_job() throws Exception {
		
		EmployeeTestData emp= new EmployeeTestData();
		String reqbody2= emp.createNewEmployee("Ronaldo", "player");
		httpRequest.body(reqbody2);
	
		}
	 * */
	/*
	 @When("user hit post request to create new employee")
	public void user_hit_post_request_to_create_new_employee() {
		
		resp2=httpRequest.post("/employees");
	
		}
	 * */
	 

	@Then("user can validate response status {string} is {string}")
	public void user_can_validate_response_status_is(String key, String value) {

		System.out.println(resp.statusCode());
		if(key.equals("code"))
		{
			Assert.assertEquals(resp.statusCode(), Integer.parseInt(value));

		}
	}


	@Then("user validate content header")
	public void user_validate_content_header() {
	    
		Headers allheader= resp.getHeaders();
		for(Header abc:allheader)
		{
			
			System.out.println(abc.getName() + "="+ abc.getValue());
			
		}
		if(allheader.equals("Content-Type")) {
		Assert.assertEquals(allheader, "application/json; charset=utf-8");
		}
	}

	@Then("user can validate response schema")
	public void user_can_validate_response_schema() {
		
		RestAssured.baseURI= "http://localhost:3000";
		httpRequest= RestAssured.given();
		httpRequest.get("/employees").then().assertThat().body(matchesJsonSchemaInClasspath("schema.json"));

	}
}
