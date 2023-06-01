package Product;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import PojoClasss.Logins;
import PojoClasss.Orders;
import PojoClasss.PlaceOrderDetails;
import PojoClasss.Respons;
import groovy.transform.stc.POJO;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class addProduct {

	public static void main(String[] args) 
	{

      RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
      .setContentType(ContentType.JSON).build();
     //Login page 
      Logins log=new Logins();
      log.setUserEmail("natugalande@gmail.com");
      log.setUserPassword("Prasad@123");
      
      RequestSpecification reqLog = given().relaxedHTTPSValidation().log().all().spec(req).body(log);
      String trespones = reqLog.when().post("/api/ecom/auth/login").
    		  then().log().all().extract().response().asString();
      
      JsonPath js=new JsonPath(trespones);
      String token=js.getString("token");
      //String Token = trespones.getToken();
      System.out.println(token);
      String userID =js.getString("userId");
     // String userId = trespones.getUserId();
      System.out.println(userID);

      //Add product
      RequestSpecification addProductReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
      .addHeader("Authorization",token).build();
      
      RequestSpecification addProductRespone = given().relaxedHTTPSValidation().log().all().spec(addProductReq).param("productName","Laptop")
      .param("productAddedBy",userID).param("productCategory","fashion").param("productSubCategory","shirts").
      param("productPrice","11500").param("productDescription","Computer").param("productFor","woman").
      multiPart("productImage",new File("C://Users//Prasad.Galande//Downloads//logos.jpg"));
      
      String addResp = addProductRespone.when().post("/api/ecom/product/add-product")
      .then().log().all().extract().response().asString();
      JsonPath js1 =new JsonPath(addResp);
      String productID = js1.getString("productId");
      System.out.println(productID);
      String responeMessage = js1.getString("message");
      System.out.println(responeMessage);
      
      //Create Order
      RequestSpecification createOrderRqe = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("Authorization",token)
      .setContentType(ContentType.JSON).build();
      
      PlaceOrderDetails pod=new PlaceOrderDetails();
      pod.setCountry("india");
      pod.setProductOrderedId(productID);
      
      List<PlaceOrderDetails> Lis = new ArrayList<PlaceOrderDetails>();
      Lis.add(pod);
      
      Orders o=new Orders();
      o.setPOders(Lis);
      
      RequestSpecification placeOrderReq = given().relaxedHTTPSValidation().log().all().spec(createOrderRqe).body(o);
      String placeOrderRespone = placeOrderReq.when().post("/api/ecom/order/create-order")
      .then().log().all().extract().response().asString();
      System.out.println(placeOrderRespone);
      
      //Delete product
      RequestSpecification orderDeleteReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
      addHeader("Authorization",token).setContentType(ContentType.JSON).build();
       
      RequestSpecification deleteRespone = given().relaxedHTTPSValidation().log().all().spec(orderDeleteReq).pathParam("ProdID",productID);
      
      String deleteRes =deleteRespone.when().delete("/api/ecom/product/delete-product/{ProdID}")
      .then().log().all().extract().asString();
      
      JsonPath js2=new JsonPath(deleteRes);
      String GetMessage = js2.getString("message");
      
      Assert.assertEquals("Product Deleted Successfully",GetMessage );
      
      
      
	}

}
