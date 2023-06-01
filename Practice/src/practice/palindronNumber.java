package practice;

import java.util.Scanner;

public class palindronNumber {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value:");
      int Value=sc.nextInt();
      int Sum=0,rev;
      int Temp=Value;
      while(Value>0)
      {
    	  rev=Value%10;
    	  Sum=Sum*10+rev;
    	  Value=Value/10;
      }
      if(Temp==Sum)
      {
    	  System.out.println("its and Palindrom number");
      }
      else {
    	  System.out.println("Not Palindrom Number");
	}
      


	}

}
