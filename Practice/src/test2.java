import java.util.Scanner;

public class test2 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the your age:");
		int Age=scan.nextInt();
		if(Age >18)
		{
			System.out.println("Major person");
		
		}
		else 
		{
        System.out.println("Minor");
	    }
	}
}