package restAssured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Validation {
	
	@Test
	public void getAll() {
		
		// need to check
		
	String response	= given().
			baseUri("https://reqres.in/").  
		when().
			get("/api/users/10").                           // json path online evalutor see sir thought how to see path
		then().                     
			statusCode(200).
			//log().status().
			//log().body();
			log().all().            // use this or use string response this method
		   extract().response().asString();   // it will come all in one line
	
	    System.out.println(response);
	
	    JsonPath js = new JsonPath(response);
	    
	  String lastname =  js.get("data.last_name");  // here u can take any value from that ur response which u got from this log all
	  System.out.println(lastname);         //fields
	
	}

}





