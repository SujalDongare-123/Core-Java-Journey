package in.softronix;

import java.util.ArrayList;
import java.util.ListIterator;


public class Cursor_05_ListIterator {

	public static void main(String[] args) {
		
ArrayList v=new ArrayList();
		
		v.add("sujal");
		v.add("abhya");
		v.add("daddu");
		v.add("babya");
		v.add("Rewlya");
		v.add(5.6);
		
		System.out.println(v);
		
	    ListIterator list = v.listIterator();
		
		System.out.println(list);
		
		while (list.hasNext())
		{
			System.out.println(list.next());
			
		}
		
		while (list.hasPrevious())		{
			System.out.println(list.previous());
			
		}

	}

}
