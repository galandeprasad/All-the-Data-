import java.util.Scanner;

public class test11 {

	public static void main(String[] args)
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		int values=scan.nextInt();
		int n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
	  for(int i=2;i<values;i++)
	  {
		  sum=n1+n2;
		  System.out.println(sum);
		  n1=n2;
		  n2=sum;
		  
	  } 
	}
}
