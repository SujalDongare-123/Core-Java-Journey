package in.softronix;

public class String_03_01 {

	public static void main(String[] args) 
	{
	
		String s1="hello";    // String Constant Pool (SCP) 
		String s2=new String("hello");// Heap memory 
		
		System.out.println(s1==s2); //false (SCP vs Heap ---> different memory )
		System.out.println(s1.equals(s2));//true (content same)
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		

	}

}
