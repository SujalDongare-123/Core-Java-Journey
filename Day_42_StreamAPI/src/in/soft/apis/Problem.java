package in.soft.apis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem {

	public static void main(String[] args)
	{
	
		List<Double> asList = Arrays.asList(1.5, 8.9, 3.2 ,4.7 );
		
		List<Double> sorted = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted);
		sorted.forEach(s->System.out.println(s));

	}

}
