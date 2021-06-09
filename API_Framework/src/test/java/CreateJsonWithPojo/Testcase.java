package CreateJsonWithPojo;

import Setup.Base;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Testcase extends Base {
	
	@Test
	public void createUser() {
		
		CreateJsonObject user = new CreateJsonObject("Shivaani", "Arun", "abc@gmail.com");
		user.addTechnologies("C");
		user.addTechnologies("Java");
		user.addTechnologies("python");
		Address address = new Address("20A", "Rajaji Nagar", "Chennai", "110292");
		user.setAddress(address);
		
		given().contentType(ContentType.JSON).body(user).log().all().post("users");
	}

}
