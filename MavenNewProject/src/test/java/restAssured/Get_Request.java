package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/*
public class Get_Request {
	
	@Test
	public void getAll() {
		
		//given() - pass information - URL, Header
		//when() - Give API methods, endpoints
		//then() - expect response, log, assertion/validation
		
		given().
			baseUri("https://dummy.restapiexample.com").  // after login whatever present that is endpoint
		when().
			get("/employees").   // endpoints
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();         // to print something 
		
	}
}
*/

public class Get_Request {                            // took from posman app
	
	@Test
	public void getAll() {
		
		//given() - pass information - URL, Header
		//when() - Give API methods, endpoints
		//then() - expect response, log, assertion/validation
		
		given().
			baseUri("https://reqres.in/").  // after login whatever present that is endpoint in which api is present
		when().
			get("/api/users?page=2").   // endpoints   // took from list users
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();         // to print something 
		
	}
}
