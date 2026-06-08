package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _08_Slicing_AllMethodInOne {

	public static void main(String[] args)
	{

		List<String> course = Arrays.asList("java","python","react","DevOps","AWS","Testing","java","python");
		

//		you can do this by doing this 
		
		Stream<String> st = course.stream();
		st.distinct().limit(5).skip(3).forEach(s->System.out.println(s));
		
		
		System.out.println("***************************************************");
//		and also this 
		
		course.stream().distinct().limit(5).skip(3).forEach(s->System.out.println(s));

	}

}
