package in.softronix;


// Intern() 

public class String_08 {

	public static void main(String[] args) {
		
		String s1=new String("hello");
		String s2=s1.intern();
		
		System.out.println(s1==s2);  // false (different memory)
		System.out.println(s1.equals(s2));//true (same content) 
		
	
		//s1 ---> Heap object 
		/*s1.intern();
		 * 
		 * intern() means : 
		 * "Give me the reference from the String Constant Pool "
		 * 
		 * if "hello " exists in SCP -> return the reference 
		 * if not -> add it to SCP and return it 
		 */
		
		//so :    s1 --> Heap "hello"
		//        s2 --> SCP  "hello"
		
		
		//intern()  returns the SCP reference , not the heap reference 
		
	

	}

}
