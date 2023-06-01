import java.util.Scanner;

public class test5 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int values=scan.nextInt();
		System.out.println("Enter the values second");
		int values2=scan.nextInt();
		for(int i=0;i<=values;i++)
		{
			
			for(int j=0;j<=values2;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("+");
				}
			}
			System.out.println();
			
			
		}
		
	}

}
