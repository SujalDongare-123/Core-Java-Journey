package in.soft.java8;

import java.util.function.Predicate;



class Pre_dcates
{

	public static void m1(int i) 
	{
	
	
	if( i>10)
	{
		System.out.println("Greater than 10");
		
	}
	else
	{
		System.out.println("Smaller than 10");
	}
	
	}
	
	
}

public class _01_java8_Predicates 
{

	public static void main(String[] args)
	{
		Pre_dcates.m1(6);
		
		
		//***************Predicates *****************
		
		Predicate<Integer> p=n->(n<10);  
		System.out.println(p.test(5));
		
		
		Predicate<Integer> p1=n->(n<10);  
		System.out.println(p1.test(11));
		
		
//		-Predicate method can take any value and returns Boolean true or false

//		-To use Predicate we need to implement Predicate interface 
//		-Predicate is a functional interface with only one abstract method ---> test(T t)

		
	}

}
