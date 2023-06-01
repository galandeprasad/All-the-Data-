package test;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class testngtest 
{

	@Test
	public void testt()
	{
      List<Integer> values = Arrays.asList(3,4,5,67,8,7,6,8,9);
	  values.stream().distinct().forEach(s->System.out.println(s));	
	}
	
	
}
