package Paginations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test4 {

	public static void main(String[] args) 
	{

      List<String> list = Stream.of("payal","Deepti","Rajeshree","aditi","Prerana")
    		  .filter(s->s.endsWith("l")).map(s->s.toUpperCase()).collect(Collectors.toList());
      System.out.println(list);
      
      List<Integer> lists = Arrays.asList(3,4,5,6,7,8,9);
      lists.stream().distinct().forEach(s->System.out.println(s));
      System.out.println(lists.get(2));

	}

}
