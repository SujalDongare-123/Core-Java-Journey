package in.softronix;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor_05_Iterator
{
//Iterator : it is used for non legacy collections 
	public static void main(String[] args) 
	{
		
		ArrayList v=new ArrayList();
		
		v.add("sujal");
		v.add("abhya");
		v.add("daddu");
		v.add("babya");
		v.add("Rewlya");
		v.add(5.6);
		
		System.out.println(v);
		
		Iterator it = v.iterator();
		
		System.out.println(it);
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
		

	}

}
