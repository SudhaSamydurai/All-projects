package StaticImport;
import static P1.StaticMethods.*;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ImportStaticMethods {
	
	public static void main(String[] args) {
//		test1();
//		test2();
//		sendGetRequest();
//		sendPostRequest();
//		sendPostRequestSpecification();
		sendPostRequestSpecification1();
	}
	
	
	public static void sendGetRequest() {
		Response response = get("https://reqres.in/api/users/2");
		response.prettyPrint();
	}
	
	public static void sendPostRequest() {
		Response response = given().contentType(ContentType.JSON).body("{\r\n"
				+ "\"name\" : \"Shaw\",\r\n"
				+ "\"job\" : \"Developer\"\r\n"
				+ "}")
		.post("https://reqres.in/api/users");
		response.prettyPrint();
	}
	
	public static void sendPostRequestSpecification() {
		RequestSpecification request = given().contentType(ContentType.JSON).body("{\r\n"
				+ "\"name\" : \"Janet\",\r\n"
				+ "\"job\" : \"Developer\"\r\n"
				+ "}");
		Response response = request.post("https://reqres.in/api/users");
		response.prettyPrint();
		
	}
	
	public static void sendPostRequestSpecification1() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

		RequestSpecification request = given().contentType(ContentType.JSON).body("{\r\n"
				+ "\"name\" : \"Janet\",\r\n"
				+ "\"job\" : \"Developer\"\r\n"
				+ "}").log().all();
		Response response = request.post("/users");
		response.prettyPrint();
		
	}
	
}
