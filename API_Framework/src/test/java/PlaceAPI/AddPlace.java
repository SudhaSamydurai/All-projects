package PlaceAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class AddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(JsonBody.JsonBodyString())
		.when().post("maps/api/place/add/json").then().assertThat().statusCode(200).log().body().body("scope", equalTo("APP")) //equalTo method comes from org.hamcrest package 
		.extract().response().asString();
		
		JsonPath js = new JsonPath(response);//Json path will parse the string to Json object
		String place_id = js.getString("place_id");
		System.out.println("Place id is: "+place_id);
		
		
		//update the place name
		String newAddress = "1000 lights spencer plaza";
		Response response1 = given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\r\n"
				+ "\"place_id\":\""+place_id+"\",\r\n"
				+ "\"address\":\""+newAddress+", USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").log().all()
		.when().put("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response();
		System.out.println("message "+response1.prettyPrint());
	}

}
