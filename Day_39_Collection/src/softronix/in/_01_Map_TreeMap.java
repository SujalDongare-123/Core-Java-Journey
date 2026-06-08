package softronix.in;

import java.util.TreeMap;

public class _01_Map_TreeMap {

	public static void main(String[] args)
	{
		TreeMap tm=new TreeMap();
		
		tm.put(1, "sujal");
		tm.put(1, "sujal");
		tm.put(2, "suja");
		tm.put(3, "suj");
		tm.put(4, "su");
		
		tm.put(5,null);
		
		//tm.put(null, "sujal");
		
		
		System.out.println(tm);
		
	}

}
