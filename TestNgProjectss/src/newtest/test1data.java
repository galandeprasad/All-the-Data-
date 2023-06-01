package newtest;


import org.testng.annotations.Test;

public class test1data 
{


	@Test(dataProvider = "getData")
	public static void Bsuite(String name,String sname)
	{
		System.out.println("Bsuite");
		System.out.println(name);
		System.out.println(sname);
	}
	@Test
	public void testcases6()
	{
		System.out.println("testcase6");
	}
	@Test
	public void testcases7()
	{
		System.out.println("testcase7");
	}

	public Object[][] getData()
	{
		
		Object [][] data=new Object[3][2];
		data[0][0]="Prasad";
		data[0][1]="Galande";
		
		data[1][0]="Rupali";
		data[1][1]="shete";
		
		data[2][0]="Sarika";
		data[2][1]="abc";
		
		return data;
		
	}
}

