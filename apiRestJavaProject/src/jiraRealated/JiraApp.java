package jiraRealated;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;

import java.io.File;

public class JiraApp {

	public static void main(String[] args)
	{
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter session=new SessionFilter();
		
		//Login page
		String response = given().header("Content-Type","application/json")
				.body("{\"username\":\"galande.prasad6\",\"password\":\"Prasad@5656\"}").
		log().all().filter(session).when().post("/rest/auth/1/session").then().extract().
		response().asString();
		
		//Add Comments
		given().pathParam("key","10004").log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\": \"Add my first comments\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(session).when().post("/rest/api/2/issue/{key}/comment/").then().log().all().assertThat().
		       statusCode(201);

        //Add Attachments
		
//		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key","10004").
//		header("Content-Type","multipart/form-data")
//		.multiPart("file",new File("jira.txt")).when().post("/rest/api/2/issue/{key}/attachments").then().
//         log().all().assertThat().statusCode(200);
		
		//get issue
		String respones = given().filter(session).pathParam("key","10004").queryParam("fields","comment").log().all().when()
		.get("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();
		System.out.println(respones);
		
		
	}

}
