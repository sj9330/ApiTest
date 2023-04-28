package com.baseAPILayer;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {
	
	
	public static RequestSpecification baseAPIPreconditon()
	{
		RestAssured.baseURI="http://localhost:3000";
		
		return RestAssured.given().contentType(ContentType.JSON);
		
	}
	
	

}
