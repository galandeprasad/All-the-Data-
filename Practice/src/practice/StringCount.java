package practice;

public class StringCount {

	public static void main(String[] args)
	{
		String str="The best of both worlds";
		int Count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ');
			Count++;
		}
		System.out.println("The string Count is:"+Count);

	}

}
