package in.soft.apis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_StreamAPI_FilterMethod {

	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList();
		
		li.add(1);
		li.add(3);
		li.add(5);
		li.add(6);
		li.add(2);
		
		System.out.println(li);
		
		Stream<Integer> st = li.stream();
		
//		Filter_Method
		
		st.filter(e ->e>2).forEach(e -> System.out.println(e));
		System.out.println(st);
		
		
		li.stream().filter(r->r>=3).forEach(r->System.out.println(r));
	}

}
