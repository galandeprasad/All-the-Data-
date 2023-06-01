
public class primeNumber {

	public static void main(String[] args) 
	{
       int number=18;
       if(number==0||number==1)
	   {
		  System.out.println("This is prime number");
	   }
       for(int i=2;i<number;i++)
       {
    	   if(number%i==0)
    	   {
    		   System.out.println("the number is not prime");
    	   }
    	   else
    	   {
    		   System.out.println("this is the prime number");
    	   }
    	   
       }
     

	}

}
