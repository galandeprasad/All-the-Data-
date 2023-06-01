package Paginations;

import java.util.stream.Stream;

public class test2 {

	public static void main(String[] args)
	{
      //end with "k" value that name displayed with Upper case
      Stream.of("Akash","Abhijeet","Ashok","Ashu").filter(s->s.endsWith("k")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
       
      
	}

}
