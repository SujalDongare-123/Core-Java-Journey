package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _07_Slicing_LimitMethod {

	public static void main(String[] args) 
	{

		List<String> course = Arrays.asList("java","python","react","DevOps","AWS","Testing","java","python");
		
		Stream<String> st = course.stream();
		
		st.limit(5).forEach(s->System.out.println(s));

	}

}
