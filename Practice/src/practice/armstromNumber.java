package practice;

import java.util.Scanner;

public class armstromNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int Value=sc.nextInt();
		int main=Value;
		int Sum=0,r;
		
		while(Value>0)
		{
			r=Value%10;
			Value=Value/10;
			Sum=Sum+r*r*r;
			
		}
		System.out.println(Sum);
		if(main==Sum)
		{
			System.out.println("Aramstrom Number");
		}
		else
		{
		System.out.println("Not Aramstrom Number:");
		}
		}

	}


