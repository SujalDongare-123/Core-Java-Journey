package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _04_FlatMap {

	public static void main(String[] args)
	{
		List<String> course =Arrays.asList("java","python","react","DevOps","AWS","Testing");
		List<String> post = Arrays.asList("DEV","TESTER","HR","CEO","MANAGER");
		
		List<List<String>> soft = Arrays.asList(course,post);
		System.out.println(soft);
		
		soft.stream().forEach(s->System.out.println(s));
		
		Stream<String> flatmap = soft.stream().flatMap(s->s.stream());
		flatmap.forEach(s->System.out.println(s));  // flatmap is combination of more than one list 
		
		

	}

}
