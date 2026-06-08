package in.soft.java8;

import java.util.function.Predicate;

public class _02_java8_Predicates {

	public static void main(String[] args)
	{
		
		String [] name= {"Aish","Ayush","Depika","Nehal","Katrina","Amit"};

		Predicate<String> p=names->(names.charAt(0)=='A');

		
		for (String n : name)
		{
			if(p.test(n)) 
			{
				System.out.println(n);
			}
			else 
			{
				
				System.out.println("Not available ");

			}
		}
		
		
		
		
	}

}
