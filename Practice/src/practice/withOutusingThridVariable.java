package practice;

import java.util.Scanner;

public class withOutusingThridVariable {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first value");
       int FirstValue=sc.nextInt();
       System.out.println("Enter the second Value");
        int SecondValue=sc.nextInt();
        System.out.println("Swapping Before value:"+ FirstValue+ "Second Value"+ SecondValue);
        FirstValue =FirstValue*SecondValue;
        SecondValue=FirstValue/SecondValue;
        FirstValue=FirstValue/SecondValue;
        System.out.println("After Swapping The value"+ FirstValue+"Second Value"+ SecondValue);

	}

}
