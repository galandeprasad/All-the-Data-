package practice;

public class VowelsString {

	public static void main(String[] args) 
	{
		String str="Prasad Galande";
		String str1=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='o'
					||str1.charAt(i)=='u'||str1.charAt(i)=='i')
		    count++; 
		}
		System.out.println(count);

	}

}
