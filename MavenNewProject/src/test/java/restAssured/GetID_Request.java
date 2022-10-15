package restAssured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetID_Request {
	
	@Test
	public void getAll() {
		
		// need to check
		
		given().
			baseUri("https://reqres.in/").  // after login whatever present that is endpoint
		when().
			get("/api/users/10").   // endpoints  if not given any number it will bring all data whatever present
		then().                     // for single user this endpoint took
			statusCode(200).
			//log().status().
			//log().body();
			log().all();         // to print something 
		
		
	}

}




