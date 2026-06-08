
// Compile time Concatenation 

package in.softronix;

public class String_04 {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="he"+"llo";
		
		System.out.println(s1==s2); 
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// What JVM does 
		
		/* "he" + "llo" are both literals 
		 * JVM joins them at compile time
		 * Final Value becomes "hello" 
		 */
		
		// now its become (String s2 ="hello";)
		
		
		
		
	//	only one object in SCP 
	//	s1 and s2 ---> same object 
		
		
		// if concatenation happens at compile time , jvm uses scp 

	}

}
