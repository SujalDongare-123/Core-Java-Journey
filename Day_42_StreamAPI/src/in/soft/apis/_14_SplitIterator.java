package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class _14_SplitIterator {

	public static void main(String[] args) 
	{
		
//		Stream<String> s = Stream.of("sujal","Sujal", "Riya","Viya");
//		Spliterator<String> spliterator = s.spliterator();
//		spliterator.forEachRemaining(System.out::println);
		
		
		List<String> li =Arrays.asList("Siya","Viya","Mia","Kiya","Jiya");
		Spliterator<String> s = li.stream().spliterator();
	//	s.forEachRemaining(e->System.out.println(e));
		
		
		System.out.println("Try Advance method return only first element of Stream");
		s.tryAdvance(e->System.out.println(e));

	}

}
