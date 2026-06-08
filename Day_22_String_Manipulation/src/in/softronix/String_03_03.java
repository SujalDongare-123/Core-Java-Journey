package in.softronix;

public class String_03_03 {

	public static void main(String[] args) {
		
		
		String  s=new String("ABCD");//
		System.out.println(s.hashCode());

		String s1="ABCD";
		System.out.println(s1.hashCode());
		
		System.out.println(s==s1);
		
		
		// to calculate hashcode value for String 
		
		// s[0]*31^(n-1) + s[1]*31^(n-2) + s[2]*31^(n-3) +s[n]*31^(n-4)...............
		
		//charAt(0) ----> java.lang.math.pow()
		//ABCD 
		
		//System.out.println(    ( (int)s.charAt(0)) * ((long)Math.pow(31,n-1))     );
		/*                           ^
		 * 							 ^
		 *                           A convert into 65   (ASCII  value )   (int) A    (Explicite  type casting ) 
		*/
		
		long sum=0;
		int n=s.length();
		
		for(int i=0;i<s.length();i++)
		{
			sum=sum+   ( (int)s.charAt(i)) * ((long)Math.pow(31,n-1-i))  ; 
		}
	}

}
