package GoogleAdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import PojoClass.AddPlace;
import PojoClass.Locations;

public class specBuilder {

	public static void main(String[] args)
	{
		
		addPlace ap=new addPlace();
		ap.setAccuracy(50);
		ap.setAddress("Prasad kunj,near ranpise");
		ap.setName("prasad galande");
		ap.setPhone_number("9552945656");
		ap.setWebsite("rahulshettyacademy.com");
		ap.setLanguage("English");
		ArrayList<String> list = new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		ap.setTypes(list);
		
		Locations l = new Locations();
		l.setLat("-38.383494");
		l.setLng("33.427362");
		ap.setLocation(l);
	
		RequestSpecification requetss = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123").setContentType(ContentType.JSON).build();
	
		RequestSpecification rep = given().spec(requetss)
		.body(ap);
		
	    ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		
		Response value = requetss.when().post("/maps/api/place/add/json").then().spec(res).extract().response();
		
		System.out.println(value);
		
	
		
		


		}
		
	}

}
