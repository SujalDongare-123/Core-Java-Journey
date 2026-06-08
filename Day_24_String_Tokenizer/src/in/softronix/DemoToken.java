package in.softronix;


import java.util.StringTokenizer;

public class DemoToken {

	public static void main(String[] args) {
		
		
		StringTokenizer st=new StringTokenizer("Softronix It Solution P.V.T  Limited");
		
		System.out.println(st);
		System.out.println(st.countTokens());  //countTokens is used to count the numbers . 
		
		
		while (st.hasMoreTokens())
		{
			
			System.out.println(st.nextToken());//nextToken method is used to go cursur on next Token .
		}
		
		

	}

}
