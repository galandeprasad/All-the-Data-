package practice;

import java.util.Scanner;

public class automorphirNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int value=sc.nextInt();
		int count=0;
		int Temp=value;
		int Squere=value*value;
		
		while(Temp>0)
		{
			count++;
			Temp=Temp/10;
		}
		int lastDigit =(int) ((int)Squere%(Math.pow(10,count)));
		
		if(lastDigit==value)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}

	

}
