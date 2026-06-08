package in.softronix;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor_05_Enumeration {

	public static void main(String[] args) 
	{
//Enumeration  :it is used for legacy collections 
		
		Vector v=new Vector();
		
		v.add("sujal");
		v.add("abhya");
		v.add("daddu");
		v.add("babya");
		v.add("Rewlya");
		v.add(5.6);
		
		System.out.println(v);
		
		Enumeration num=v.elements();
		
		while (num.hasMoreElements())
		{
			System.out.println(num.nextElement());
			
		}
		
	

	}

}
