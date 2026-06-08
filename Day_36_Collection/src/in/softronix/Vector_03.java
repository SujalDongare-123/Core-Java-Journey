package in.softronix;

import java.util.Vector;

public class Vector_03 {

	public static void main(String[] args) 
	{
		
		Vector v=new Vector();
		System.out.println(v.capacity());// initial capacity is 10
		
		
		Vector v1=new Vector(20);
		System.out.println(v1.capacity());
		
		
		v.add("sujal");
		v.add("rakesh");
		v.add("priyanshu");
		v.add("Prathamesh");
		v.add("abhya");
		v.add("daddu");
		v.add("babya");
		
		System.out.println(v);
		
		//Methods 
		
//		addElement method
		v.addElement("rewal");
		System.out.println(v);
		
//		firstElemtn
	    System.out.println(v.firstElement());
	    
//	    lastElement
	    System.out.println(v.lastElement());
	    
	    
//	    elementAt(int index)
	    System.out.println(v.elementAt(0));
	    
//         removeElement(Object obj)
	    v.removeElement("rewal");
	    System.out.println(v);
	    
//	    removeElementAt(int index)
	    
	    v.removeElementAt(6);
	    System.out.println(v);
	    
	    
//	    removeAllElements()
	    
//	    v.removeAllElements();
//	    System.out.println(v);
	    
	    
//	    public Vector(Collection c)
//	    This constructor can be used to create Vector object with all the elements of the specified Collection object.

	    
	    Vector v2=new Vector(v);
	    System.out.println(v2);
	    
	    
	    
		
	}

}
