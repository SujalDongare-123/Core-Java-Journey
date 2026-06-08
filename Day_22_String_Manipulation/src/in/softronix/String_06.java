package in.softronix;

// Runtime Concatenation 

public class String_06 {

	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="he";
		String s3=s2+"llo";
		
		
		System.out.println(s1==s3);   // false (SCP vs Heap)
		System.out.println(s1.equals(s3));// true (same content)
		
		
		// String s2="he";    Stored in SCP 
		
		/*  s3=s2+"llo";      
		 * 
		 * This happens at runtime , not compile time 
		 * Creates new Object in Heap 
		 * s3--> Heap "hello";
		 *  
		 */
		
		
		// if any variable is involved  in concatenation , a new heap object is created  .

	}

}
