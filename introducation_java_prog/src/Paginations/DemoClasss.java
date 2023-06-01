package Paginations;

import java.util.ArrayList;

public class DemoClasss {

	public static void main(String[] args)
	{
      ArrayList<String> names=new ArrayList<String>();
      names.add("Prasad");
      names.add("Akshay");
      names.add("Ashu");
      names.add("Anu");
      names.add("rupa");
      long test = names.stream().filter(s->s.startsWith("P")).count();
      System.out.println(test);
	}

}
