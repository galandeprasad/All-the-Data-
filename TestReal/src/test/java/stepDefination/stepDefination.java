package stepDefination;

import java.util.ArrayList;
import java.util.List;


import PojoClass.AddPlace;
import PojoClass.Locations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class stepDefination 
{

	@Given("Add Place Payload")
	public void add_place_payload() 
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		AddPlace ap=new AddPlace();
		ap.setAccuracy(40);
	      ap.setAddress("Prasad kunj,sutarwadi");
	      ap.setPhone_number("9552945656");
	      ap.setWebsite("rahulshettyacademy.com");
	      ap.setLanguage("English");
	      ap.setName("Prasad");
	      List<String> AList = new ArrayList<String>();
	      AList.add("shoe park");
	      AList.add("shop");
	      ap.setTypes(AList);
	      Locations l=new Locations();
	      l.setLatitude(-38.383494);
	      l.setLongitude(33.427362);
	      
	      ap.setLocation(l);
	      
	      
	      
	}
	@When("user calls {string} with Post http request")
	public void user_calls_with_post_http_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
