package in.soft.apis;

import java.util.stream.Stream;

public class _13_ParallelStream {

	public static void main(String[] args)
	{
		System.out.println("***************Sequencetial Stream************************");
		
		Stream<Integer> s = Stream.of(1,2,3,4,5,6,7,8,9);
		s.forEach(i->System.out.println(i+"   "+Thread.currentThread()));
		
		
		System.out.println("****************Parallel Stream*****************************");
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9);
		s1.parallel().forEach(i->System.out.println(i+" "+Thread.currentThread()));

		
	//Serial Stream or Sequential Stream  and Parallel 	 Stream  The main difference is Synchronized and non-Synchronized
		
		
	}

}
