package apiRestJavaProject;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

import static io.restassured.RestAssured.*;

public class Basic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Given
		//When
		//Then
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Prasad Galande\",\r\n"
				+ "  \"phone_number\": \"(+91) 9552945656\",\r\n"
				+ "  \"address\": \"Prasad kunj,near ranpise vitthal mandir sutarwadi,pashan,pune\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "").when().post("/maps/api/place/add/json").then()
		.log().all().assertThat().statusCode(200);
		


	}

}
