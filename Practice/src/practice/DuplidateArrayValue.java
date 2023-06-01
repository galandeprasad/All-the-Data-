package practice;

public class DuplidateArrayValue {

	public static void main(String[] args) 
	{
      int [] Arr =new int []{1,3,4,2,3,5,3,6,2,1,12,32,34,12};
      System.out.println("Duplidate Array value");
      
      for(int i=0;i<Arr.length;i++)
      {
    	  for(int j=i+1;j<Arr.length;j++)
    	  {
    		  if(Arr[i]==Arr[j])
    			  System.out.println(Arr[j]);
    	  }
    	  
      }


	}

}
