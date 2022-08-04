package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAndPost {
@Test
	public void getTest() {

	baseURI = "https://reqres.in/api/";


	given().get("users?page=2").then().body("data[0].first_name",equalTo("Michael") ).
	body("data.first_name",hasItems("Byron","Rachel")).
	body("data.id", hasItems(7,8,9,10));
	
		
	}

}
