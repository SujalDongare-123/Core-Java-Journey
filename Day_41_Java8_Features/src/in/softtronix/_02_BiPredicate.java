package in.softtronix;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class _02_BiPredicate {

	public static void main(String[] args)
	{
		//BiFunction
		
		BiFunction<Integer, Integer, Integer> add=(a,b)->{return a+b;};
	//	BiFunction<Integer, Integer, Integer> add=(a,b)-> a+b;
	    System.out.println(add.apply(10, 20));
	    
	    
	  
	    
	  //Bipredicate   
	    BiPredicate<String, Integer> s = (str, len) -> str.length() == len;

        System.out.println(s.test("Nagpur", 6)); // true
        System.out.println(s.test("Java", 10));  // false
        
       // Biconsumer 
        BiConsumer<String, Integer> con = (name, age) ->  System.out.println(name + " is " + age + " years old.");

        con.accept("Sujal", 20);
        con.accept("Java", 25);

        
        
  
        


	}

}
