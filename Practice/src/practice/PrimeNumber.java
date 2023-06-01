package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
       int i,m=0,flag=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Value:");
       int accept=sc.nextInt();
       
       if (accept==0||accept==1)
       {
    	   System.out.println("Not Prime Number");
       }
       else
       {
    	   for(i=2;i<accept;i++)
    	   {
    		   if(accept%i==0)
    		   {
    			   System.out.println("Not Prime Number");
    			   flag=1;
    			   break;
    		   }
    		   
    		   
    	   }
    	   
    	   if(flag==0)
    	   {
    		   System.out.println("the prime number");
    	   }
    	   
       }
       


	}

}
