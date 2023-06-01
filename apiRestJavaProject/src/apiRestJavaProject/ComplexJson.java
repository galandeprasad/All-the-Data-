package apiRestJavaProject;
import comman.payload;

import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) 
	{
		int sum=0;
		JsonPath jp=new JsonPath(payload.multipleQuery());
		//print number of courses available in api
		int count = jp.getInt("courses.size()");
		System.out.println(count);
		
		//Total value in Api
		int Totalamount=jp.getInt("dashboard.purchaseAmount");
		System.out.println(Totalamount);
		
		//First Value
		String firstTitle=jp.get("courses[0].title");
		System.out.println(firstTitle);
		
		//Last title
		
		String LastTitle = jp.getString("courses[2].title");
		System.out.println(LastTitle);
		
		//Print all the title and prices
		
		for(int i=0;i<count;i++)
		{
			String Titlevalue=jp.get("courses["+i+"].title");
			
			int prices = jp.getInt("courses["+i+"].price");
			System.out.println(Titlevalue);
			System.out.println(prices);
			
		}
		
		
		
		// print number of copies sold by rpa
		
		System.out.println("number of Selenium Python copice sold");
		
		for(int i=0;i<count;i++)
		{
			String Titlevalues = jp.get("courses["+i+"].title");
			if(Titlevalues.equalsIgnoreCase("Selenium Python"))
			{
				int copises = jp.getInt("courses["+i+"].copies");
				System.out.println(copises);
				break;
			}
		}
		
		//varify the amount of purchase 
		
		for(int i=0;i<count;i++)
		{
			
			 int price = jp.getInt("courses["+i+"].price");
			//System.out.println(price);
			int copies =jp.get("courses["+i+"].copies");
			int total = price*copies;
			sum=total+sum;
			
			
		}
		System.out.println(sum);
	
		if(Totalamount==sum)
		{
			System.out.println("varifyed");
		}
		else
		{
			System.out.println("false");
		}
	}
	

}
