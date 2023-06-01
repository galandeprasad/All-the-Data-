package practice;

public class ArrayAsending {

	public static void main(String[] args) 
	{
      int []arr={1,2,3,1,5,9,7,85,4,24};
      int temp=0;
      System.out.println("The original Array");
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.print(" "+arr[i]);
      }
      System.out.println();
      System.out.println("the Asending Order:");
      for(int j=0;j<arr.length;j++)
      {
    	  for(int m=j;m<arr.length;m++)
    	  {
    		  if(arr[j]>arr[m])
    		  {
    			  temp=arr[j];
    			  arr[j]=arr[m];
    			  arr[m]=temp;
    		  }
    			  
    	  }
    	  
    	  
      } 
      System.out.println();     
      
      for(int n=0;n<arr.length;n++)
      {
    	  System.out.print(" "+arr[n]);
      }
      int val =arr.length;
     // System.out.println(val);
      
      System.out.println(arr[val-2]); 
      
	}
	
	

}
