package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Examples {

	@Test
	public void test_1() {

		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("Status code:" + response.statusCode());
		System.out.println("Response time: " + response.getTime());
		System.out.println(response.getBody().asString());
		
		int statusCode =  response.statusCode();
		Assert.assertEquals(statusCode, 200);
			
		}	
		

	@Test
	public void test_2() {
		baseURI= "https://reqres.in/api/";
		given().get("users?page=2").then().statusCode(200).body("data[0].id",equalTo(7))
		.log().all();
		
	}

}
