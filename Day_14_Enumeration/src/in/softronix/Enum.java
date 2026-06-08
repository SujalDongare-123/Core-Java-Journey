package in.softronix;

import java.util.Iterator;

enum  Courses {
	
	Java,Python,Aws, html,css,javascript, DevOps;
}

public class Enum {

	public static void main(String[] args) {
		
		
		Courses[] c=Courses.values();
		
		for(Courses cc:c)  // This is for each loop 
		{
			System.out.println(cc);
		}
		
//	for (int i = 0; i < c.length; i++)  // This is for loop  both can perform the same thing but in deffrent way 
//	{
//		System.out.println(c[i]);
//	}
		
		
		

	}

}
