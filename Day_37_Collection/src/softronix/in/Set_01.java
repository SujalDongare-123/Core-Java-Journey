package softronix.in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_01
{

	public static void main(String[] args)
	{
		// List
		List li=new ArrayList()	;
		
		li.add("siya");
		li.add(54);
		li.add("riya");
		li.add("kiya");
		li.add(25.54);
		li.add("siya");
		li.add(null);
		li.add(null);
		li.add(null);
		
		System.out.println("List.Arraylist="+li);
		
		
		
		// Set   LinkedHashSet
		
		Set set=new LinkedHashSet();
		
		set.add("siya");
		set.add(54);
		set.add("riya");
		set.add("kiya");
		set.add(25.54);
		set.add("siya");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println("set.LinkedHashSet ="+set);
		
		//Set HashSet
		
		
      Set s=new HashSet();
		
		s.add("siya");
		s.add(54);
		s.add("riya");
		s.add("kiya");
		s.add(25.54);
		s.add("siya");
		s.add(null);
		s.add(null);
		s.add(null);
		
		System.out.println("set.HashSet ="+s);
		
		
		// Set tree
		
		 Set st=new TreeSet();
			
			st.add("siya");
	//		st.add(54);
			st.add("riya");
			st.add("kiya");
	//		st.add(25.54);
			st.add("siya");
	//		st.add(null);
	//		st.add(null);
	//		st.add(null);
			
			System.out.println("set.TreeSet ="+st);
			
			
			// Sortedset   Methods 
			
			 SortedSet stt=new TreeSet();
				
				stt.add("siya");
		//		stt.add(54);
				stt.add("riya");
				stt.add("kiya");
		//		stt.add(25.54);
				stt.add("siya");
		//		stt.add(null);
		//		stt.add(null);
		//		stt.add(null);
				stt.add("viya");
				stt.add("diya");
				stt.add("piya");
				stt.add("miya");
				
				System.out.println("Sortedset.TreeSet ="+stt);
				
				
				System.out.println(stt.headSet("riya"));
				System.out.println(stt.tailSet("riya"));
				System.out.println(stt.subSet("miya", "viya"));		
			
 
	}

}
