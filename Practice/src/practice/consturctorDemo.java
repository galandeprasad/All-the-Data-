package practice;

public class consturctorDemo {
	
	
	consturctorDemo()
	{
     this(12,34);
	System.out.println("test 1");	
	}
	consturctorDemo(int a)
	{
    this();
	System.out.println("test 2");
	System.out.println(a);
	}
	consturctorDemo(int b,int c)
	{
		this("prasad");
		System.out.println("test 3");
	}
	consturctorDemo(String s)
	{
		System.out.println("test 5");
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		consturctorDemo cd=new consturctorDemo(5);

	}

}
