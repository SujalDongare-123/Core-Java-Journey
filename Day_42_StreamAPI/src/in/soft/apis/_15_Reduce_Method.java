package in.soft.apis;

import java.util.Arrays;
import java.util.List;

public class _15_Reduce_Method {

	public static void main(String[] args) 
	{
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		
		Integer reduce = asList.stream().reduce(1,(a,b)->a*b);

		System.out.println(reduce);
	
	
	}
	

}
