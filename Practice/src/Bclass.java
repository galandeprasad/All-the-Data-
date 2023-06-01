
public class Bclass extends Aclass

{
  
	public void run() 
	
	{
		System.out.println("b class method");
	}
	
	public static void main(String[] args)
	{
		Bclass b=new Bclass();
		b.run();
		Aclass a=new Aclass();
		a.run();
	}
	
	
	
}
