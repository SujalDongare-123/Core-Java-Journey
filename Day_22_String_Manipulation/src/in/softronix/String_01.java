package in.softronix;

public class String_01 {

	public static void main(String[] args)
	{
		String s="Soft";
		String s1="Soft";
		
		
		System.out.println(s==s1);       // true (same memory)----->(compares reference ( memory location  or address))
		System.out.println(s.equals(s1));// true (same content)----->(compares content)
		
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		//Only one String Object is Created  in String Constant Pool Area and both references point to the same object . 
		
		

	}

}
