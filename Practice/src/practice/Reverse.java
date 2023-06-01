package practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the value:");
      int value=Sc.nextInt();
      int res;
      int temp=0;
      while(value>0)
      {
    	  res=value%10;
    	  temp=temp*10+res;
    	  value=value/10;
    	  
      }
      System.out.println("the revers" + temp);
      
      
      
      
    		  

	}

}
