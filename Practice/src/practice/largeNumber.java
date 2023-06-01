package practice;

public class largeNumber {

	public static void main(String[] args) 
	{
		int [] arr=new int[] {27,48,18,59,98,34,57,99,323};
		
		int temp=arr[0];
		int small=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}
			if(arr[i]<small)
			{
				small=arr[i];
			}	
		}
		
		int Sum=0;
		for(int j=0;j<arr.length;j++)
		{
			Sum=Sum+arr[j];
		}
		System.out.println("largest number "+temp);
		System.out.println("Smallest Number "+small);
		System.out.println("The Array list Sum "+Sum);

	}

}
