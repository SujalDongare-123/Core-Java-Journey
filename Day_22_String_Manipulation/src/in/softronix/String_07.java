package in.softronix;


// NULL Trap(Interviewer favorite )
public class String_07 {

	public static void main(String[] args) 
	{
	
		
		String  s1=null;
		String s2="hello";
		
		System.out.println(s1==s2);   // false
		
		
	//	System.out.println(s1.equals(s2));
		
		// s1 is null   and you are calling method on null , JVM will throw Exception . 
		// NullPointerException
		
		
		System.out.println("hello".equals(s2));  //never call .equals() on null
		
//		Safe way   "hello".equals(s1)
		
		// Why ?    because "hello" is never null 
		
		
		
		
		

	}

}
