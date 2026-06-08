package softronix.in;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_02_SortedSet {

	public static void main(String[] args) 
	{
		
		
		NavigableSet ss=new TreeSet();
		
		ss.add(50);
		ss.add(10);
		//ss.add(40);
		ss.add(90);
	//	ss.add(80);
		ss.add(60);
		ss.add(70);
		ss.add(100);
		
		System.out.println(ss);
		
	    System.out.println(ss.ceiling(40));//it will return the specified value . if it is not then it will return the one element greater than specified element
	    System.out.println(ss.higher(90));// it skip the specified element and return the first greater element of the specified element whether the specified element  it is available.
	    System.out.println(ss.floor(80));// it is opposite of ceiling 
	    System.out.println(ss.lower(100));//it is opposite  of higher 
	    System.out.println(ss.pollFirst());
	    System.out.println(ss);// remove the 10
	    System.out.println(ss.pollLast());//remove the 100
	    System.out.println(ss);
	    System.out.println(ss.descendingSet());
	    
	    
	    
		
	}

}
