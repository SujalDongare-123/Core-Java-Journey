package in.softronix;

public class String_03_02 {

	public static void main(String[] args) 
	{
		
		String s1="hello";    // String Constant Pool (SCP) 
		String s2=new String("hello");// Heap memory 
		
		
		
		System.out.println(s1==s2); //false (SCP vs Heap ---> different memory )
		System.out.println(s1.equals(s2));//true (content same)
		
		
//		 memory allocation is different but the hashcode value is same   ?
		
		System.out.println(s1.hashCode()); //99162322
		System.out.println(s2.hashCode());// 99162322
		
		
		// Hash code is calculated based on content , not memory location or addresss 
		// both String contains "hello " 
		
	
		/*so : 
		*	memory location  is diffrent 
		*	content  same 
		*	hashcode is same 
			
			
		*	Equal objects must have the same hashCode , but same hasdCode does not mean objects are equal 
			
		*	System.out.println(s1==s2); //false (different objects)
		
		
		
		Yes , both returns the same hashcode beacause Strings  hasdCode is content based  not reference based . 
			
		*/
		
		
		
		
		

	}

}
