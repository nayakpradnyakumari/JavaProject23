package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put_Request {
	
	@Test
	public void post() {                // post is used to create something, go to that post website u will come to know
		
		// need to check
		
		given().
			baseUri("https://reqres.in/").  // after login whatever present that is endpoint
			header("Content-Type", "application/json").
			
			body(" {\r\n"
					+ "    \"name\": \"Nayak\",\r\n"
					+ "    \"job\": \"QA\"\r\n"
					+ "} ").                                    // took from post details on that page
		when().
			put("/api/users/578").   // endpoints  
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();         // to print something 
		
	}

}




