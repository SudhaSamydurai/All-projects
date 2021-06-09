package StepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.junit.Assert;

import Resources.APIResources;
import Resources.TestDataBuild;
import Resources.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PlaceValidation extends Utility {
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;

	@Given("Add place payload {string} {string} {string}")
	public void add_place_payload(String name, String lang, String address) throws IOException {

//		RestAssured.baseURI = "https://rahulshettyacademy.com";
		TestDataBuild testData = new TestDataBuild();

		res = given().spec(requestSpecification()).body(testData.addPlacePayload(name, lang, address));

	}

	@When("User calls {string} with http {string} request")
	public void user_calls_with_http_post_request(String resourceName, String resourceType) {

		APIResources apiResource = APIResources.valueOf(resourceName);
		apiResource.getResource();

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (resourceType.equalsIgnoreCase("POST"))
			response = res.when().post(apiResource.getResource()).then().spec(resspec).extract().response();
		else if (resourceType.equalsIgnoreCase("GET"))
			response = res.when().get(apiResource.getResource());

	}

	@Then("verify {string} is matching in {string} response")
	public void verify_is_matching_in_response(String expectedName, String resourceName) throws IOException {

		String place_id = getJsonPathValue(response, "place_id");
		res = given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_with_http_post_request(resourceName, "GET");

		String name = getJsonPathValue(response, "name");
		Assert.assertEquals(name, expectedName);

	}

	@Then("API call got success with status code {int}")
	public void api_call_got_success_with_status_code(Integer int1) {
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_the_response_body_is(String keyValue, String expectedValue) {
		String resp = response.asString();
		JsonPath path = new JsonPath(resp);
		Assert.assertEquals(path.get(keyValue).toString(), expectedValue);
	}

}
