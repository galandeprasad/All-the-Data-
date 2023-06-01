package practiceAPI.testAPI;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class basic {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	      given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
	      .body("{\r\n"
	      		+ "  \"location\": {\r\n"
	      		+ "    \"lat\": -38.383494,\r\n"
	      		+ "    \"lng\": 33.427362\r\n"
	      		+ "  },\r\n"
	      		+ "  \"accuracy\": 50,\r\n"
	      		+ "  \"name\": \"Prasad galande\",\r\n"
	      		+ "  \"phone_number\": \"952945656\",\r\n"
	      		+ "  \"address\": \"152,prasad kunj near sutarwadi\",\r\n"
	      		+ "  \"types\": [\r\n"
	      		+ "    \"shoe park\",\r\n"
	      		+ "    \"shop\"\r\n"
	      		+ "  ],\r\n"
	      		+ "  \"website\": \"http://rahulshettyacdamy.com\",\r\n"
	      		+ "  \"language\": \"marathi\"\r\n"
	      		+ "}\r\n"
	      		+ "").when().post("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200);

	}

}
