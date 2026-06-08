package in.softronix;

public class String_02 {

	public static void main(String[] args) {
		
		
		String s=new String("Soft");
		String s1=new String("Soft");
		
		
		// Two different objects is create in the heap memory . 
		
		System.out.println(s==s1);//false (different memory )
		System.out.println(s.equals(s1)); // true (same content )
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		

	}

}
