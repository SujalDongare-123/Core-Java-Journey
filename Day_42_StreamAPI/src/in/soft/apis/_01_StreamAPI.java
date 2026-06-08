package in.soft.apis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_StreamAPI {

	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList();
		
		li.add(1);
		li.add(3);
		li.add(5);
		li.add(6);
		li.add(2);
		
//		There are two ways to create stream 
		
		
//		Stream Method 
		
		Stream<Integer> st = li.stream();
		System.out.println(st);
		
//		Stream.of (e1, e2, e3, e4.....)
		
		Stream<Integer> stream = Stream.of(1,2,4,5,2);
		System.out.println(stream);
	
		
;	}

}
