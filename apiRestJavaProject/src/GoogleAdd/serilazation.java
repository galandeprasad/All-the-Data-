package GoogleAdd;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class serilazation {

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
	
		String respones = RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123")
		.body(ap).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).
		extract().response().asString();
		System.out.println(respones);
		
		
		
	}

}
