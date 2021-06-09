package jsonCreation;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import Setup.Base;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Method1 extends Base{
	
	@Test
	public void createUser() {
		//Method 1 using JsonObject and JsonArray
		String endPoint = "/users";
		JSONObject json = new JSONObject();
		json.put("name", "Sudha");
		json.put("role", "developer");
		json.put("Company", "WElls");
		System.out.println(json);
		
		JSONArray jsonarr = new JSONArray();
		jsonarr.put("C");
		jsonarr.put("Java");
		jsonarr.put("Python");
		json.put("technology", jsonarr);
		System.out.println(json);

		String jsonBody = Method1.createJsonArray();
		Map<String, Object> jsonBodyFromMap = Method1.createJsonArrayviaMap();

//		RequestSpecification request = given().contentType(ContentType.JSON).body(json.toString()).log().body();
//		RequestSpecification request = given().contentType(ContentType.JSON).body(jsonBody).log().body();
		RequestSpecification request = given().contentType("application/json").body(jsonBodyFromMap).log().body();

		Response response = request.post(endPoint);
		response.prettyPrint();
		System.out.println(response.statusCode());
		
	}

	//Create Json Array 
	//More than one json array
	public static String createJsonArray() {
		String endPoint = "/users";
		
		JSONObject json = new JSONObject();
		json.put("name", "Sudha");
		json.put("role", "developer");
		json.put("Company", "WElls");
		
		JSONArray jsonarr = new JSONArray();
		jsonarr.put("C");
		jsonarr.put("Java");
		jsonarr.put("Python");
		json.put("technology", jsonarr);
		
		JSONObject json1 = new JSONObject();
		json1.put("name", "Shivaani");
		json1.put("role", "Doctor");
		json1.put("Company", "Apollo");
		
		JSONArray jsonarr1 = new JSONArray();
		jsonarr1.put("Ortho");
		jsonarr1.put("Neuro");
		jsonarr1.put("obstri");
		json1.put("technology", jsonarr1);
		
		JSONArray jsonarr2 = new JSONArray();
		jsonarr2.put(json);
		jsonarr2.put(json1);

		return jsonarr2.toString();

	}
	
	//Method 2 with Hashmap and arrraylist
	//Create Json array from Map and arraylist
	
	public static Map<String, Object> createJsonArrayviaMap() {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Shivaani");
		map.put("role", "SDET");
		map.put("Company", "Wells");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Java");
		list.add("Phython");
		map.put("technology", list);
		return map;
	}
}
