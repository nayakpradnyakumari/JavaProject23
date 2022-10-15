package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Delete_Request {
	
	@Test
	public void post() {                // post is used to create something, go to that post website u will come to know
		
		// need to check
		
		given().
			baseUri("https://reqres.in/").  // after login whatever present that is endpoint
			header("Content-Type", "application/json").
				               
		when().
		delete("/api/users/578").   // endpoints        // they have given 204 there that means it will not delete
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();         // to print something 
		
	}

}





