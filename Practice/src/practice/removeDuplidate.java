package practice;

public class removeDuplidate {

	public static void main(String[] args) 
	{
		String str="Prasad Galande Deepak";
		int count;
		char [] arr =str.toCharArray();
        System.out.println("Print duplicate Array:");
        for(int i=0;i<str.length();i++)
        {
        	count=1;
        	for(int j=i+1;j<str.length();j++)
        	{
        		if(arr[i]==arr[j]&&arr[i]!=' ')
        		{
        			count++;
        			//arr[j]=0;
        		}
        	}
        	if(count>1 && arr[i]!='0')
            {
            	System.out.println(arr[i]);
            	
            }
        }
        
	}

}
