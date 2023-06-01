package practice;

public class removeDuplidateValue {
	
	
	public static int removeDuplidate(int arr[],int len) 
	{
		if(len==0||len==1)
		{
			return len;
		}
		
		int [] temp=new int[len];
		int j=0;
		for(int i =0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[len-1];
	 for(int p=0;p<len-1;p++)
	 {
		 arr[p]=temp[p];
	 }
	 return j;
		
	}
	

	public static void main(String[] args)
	{
      int [] arr ={2,3,52,6,7,3,4,3,2,7,8,9,0,4};
      int len =arr.length;
      
      int val = removeDuplidate(arr,len);
      for(int i=0;i<val;i++)
      {
    	   System.out.println(arr[i]);
      }
      

	}

}
