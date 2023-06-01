package practice;

import java.util.Scanner;

public class fibonabiseriese {

	public static void main(String[] args)
	{
		
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value :");
	   int Value=sc.nextInt();
       int first=0;
       int Second=1;
       int Temp=0;
       System.out.print(first +" "+Second);
       for(int i=2;i<Value;i++)
       {
    	   Temp=first+Second;
    	   System.out.print(" "+Temp);
    	   first=Second;
    	   Second=Temp;
    	   
       }
     
		 

	}

}
