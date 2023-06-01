package rahul;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class demoAddPlace {

	public static void main(String[] args) 
	{
	 
	 RestAssured.baseURI="https://rahulshettyacademy.com";
	 AddPlace ap=new AddPlace();
	 ap.setAccuracy(50);
	 ap.setAddress("29,side layout, cohen 09");
	 ap.setLanguage("French-IN");
	 ap.setPhone_number("9552945656");
	 ap.setWebsite("rahulshettyacademy.com");
	 ap.setName("Prasad Galande");
	 
	 List<String> list = new ArrayList<String>();
	 list.add("shoe park");
	 list.add("shop");
	 ap.setTypes(list);
	 
     Locations l=new Locations();
     l.setLatitude(-38.383494);
     l.setLongitude(33.427362);
     ap.setLocation(l);
     
     RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
     .addQueryParam("key","qaclick123").setContentType(ContentType.JSON).build();
     
     RequestSpecification reps = given().relaxedHTTPSValidation().spec(reqSpec).body(ap);
    
     ResponseSpecification respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
     
     Response Responesss = reps.when().post("/maps/api/place/add/json").then().spec(respSpec).extract().response();
     
     
     String prasad = Responesss.asString();
     System.out.println(prasad);
     
	}

}
