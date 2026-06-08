package in.softronix;

class B
{
	private static B b=null;

	
	static {
		b=new B();
	}
	public static B get() 
	{
		return b;
	}
}

public class SecondWay {

	public static void main(String[] args) {
		
		B b1=new B();
		System.out.println(b1);  // this is taken  because you dont add the private constructor .. if you add the private constructor then the B() cant be access in the main class 
		
		B b2=B.get();
		System.out.println(b2.get());
		
		B b3=B.get();
		System.out.println(b3.get());
		

	}

}
