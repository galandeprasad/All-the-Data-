package Paginations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class test3 {

	public static void main(String[] args) 
	{

      List<String> Inames = Arrays.asList("Ashu","Nikita","Rupali","Sarika","Vaishanvi");
      Inames.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
  
      List<String> Inames2 = Arrays.asList("Prasad","Ramesh","Natu","Sonya");
      // Merging the array list
     Stream<String> Stored = Stream.concat(Inames.stream(), Inames2.stream());
     Stored.sorted().forEach(s->System.out.println(s));
     //Checking the value in both array list
    // Stored.anyMatch(s->s.equalsIgnoreCase("sarika"));
     //Assert.assertTrue(true);
      
	}

}
