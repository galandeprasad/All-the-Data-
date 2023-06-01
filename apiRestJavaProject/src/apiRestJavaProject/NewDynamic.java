package apiRestJavaProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import comman.ReUsableMethods;
import comman.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class NewDynamic 
{

	@Test(dataProvider="BookData")
	public void Addbook(String Value1,String Value2)
	{
	
		RestAssured.baseURI="http://216.10.245.166";
		String getResopse = given().log().all().header("Content-Type","application/json")
		.body(payload.AddBook(Value1,Value2)).when().post("/Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReUsableMethods.rawToJson(getResopse);
		String IDvalue = js.get("ID");
		System.out.println(IDvalue);
		
		
		
	}
	
	@DataProvider(name="BookData")
	public Object[][] getData()
	{
		
		return new Object[][]{{"nikita232","5400"},{"Prasad23","5656"},{"Rupali232","7171"}};
		
	}
	
}
