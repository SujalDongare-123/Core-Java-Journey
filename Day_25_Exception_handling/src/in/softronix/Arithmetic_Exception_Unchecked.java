package in.softronix;

public class Arithmetic_Exception_Unchecked {

	public static void main(String[] args) 
	{
		int age=34;
		int  a=3;
		int c=age/a;
		
		System.out.println(c);
		 
		
		String name=null;
		System.out.println(name.length());
		
		
	//Arithmetic Exception 
		int  b=0;
		int d=age/b;    //java.lang.ArithmeticException:   
		
		System.out.println(d);
		
		
		

	}

}
