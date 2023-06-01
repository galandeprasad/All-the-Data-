package rahul;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.*;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class demoAddPlace {

	public static void main(String[] args) 
	{
		AddPlace ap=new AddPlace();
	 RestAssured.baseURI="https://rahulshettyacademy.com";
	 ap.setAccuracy(50);
	 ap.setAddress("Prasad kunj near ranpise vitthal mandir");
	 ap.setName("Prasad");
	 ap.setPhone_number("9552945656");
	 ap.setLanguage("English");
	 ap.setWebsite("rahulshettyacademy.com");
	 List<String> list = new ArrayList<String>();
	 list.add("shoe park");
	 list.add("shop");
	 ap.setTypes(list);
     Locations l=new Locations();
     l.setLatitude(-38.383494);
     l.setLongitude(33.427362);
     ap.setLocation(l);
     
     ValidatableResponse resp = given().relaxedHTTPSValidation().queryParam("key","qaclick123").body(ap).when().
     post("/maps/api/place/add/json").then().assertThat().statusCode(200);
     
    
     
	}

}
