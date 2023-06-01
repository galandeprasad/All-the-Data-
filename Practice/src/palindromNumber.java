import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The number:");
		int number=scan.nextInt();
		int temp=0,sum=0,r;
		temp=number;
		while(number>0)
		{
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
			
		}
		if(temp==sum)
		{
			System.out.println("it is an Palindrom Number:");
		}
		else
		{
			System.out.println("Not Palindrom number");
		}
		
		}
		
		

	}


