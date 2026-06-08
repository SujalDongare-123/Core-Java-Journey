package in.soft.apis;

import java.util.Arrays;
import java.util.List;

public class _05_Slicing_distinctMethod {

	public static void main(String[] args)
	{

//1) distinct ( )  => To get unique elements from the Stream
//2) limit ( long maxSize )  => Get elements from the stream based on given size
//3) skip (long n)  => It is used to skip given number of elements from starting position of the stream
		
		List<String> course = Arrays.asList("java","python","react","DevOps","AWS","Testing","java","python");
		
		course.stream().distinct().forEach(s->System.out.println(s));

		
	}

}
