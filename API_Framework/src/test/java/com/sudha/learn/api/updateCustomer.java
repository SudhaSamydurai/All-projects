package com.sudha.learn.api;

import Setup.Base;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class updateCustomer extends Base{
	
	@Test
	public void updateCustomer() {
		
		String endpoint = "/users/1";
		File f = new File("E:\\Workspace\\API_Framework\\src\\test\\resources\\simpleJson.json");
		Response response = given().contentType(ContentType.JSON).body(f).put(endpoint);
		response.prettyPrint();
	}

}
