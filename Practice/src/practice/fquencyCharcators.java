package practice;

public class fquencyCharcators {

	public static void main(String[] args)
	{
		String str="Prasad Galande";
		int []feq=new int[str.length()];
		
		char []ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			feq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				feq[i]++;
				//ch[j]=0;
			}
			
			
		}
		System.out.println("the duplicate value");
		for(int m=0;m<feq.length;m++)
		{
			if(ch[m]!=' '&& ch[m]!='0')
			{
				System.out.println(ch[m]+"-"+feq[m]);
			}
		}

	}
	
      
	

}
