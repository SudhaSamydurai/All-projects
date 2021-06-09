package Setup;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
public class Base {
 
  @BeforeSuite
  public void beforeSuite() {
	  RestAssured.baseURI="https://reqres.in/";
	  RestAssured.basePath="api";
	  
  }

}
