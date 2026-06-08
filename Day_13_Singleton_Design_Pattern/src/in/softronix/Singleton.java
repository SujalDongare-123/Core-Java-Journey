package in.softronix;
// This method is called Lazy initialization 
class A
{
	
	
	private static A a=null;
	
	private A() {
		
	}
	
	public static A get() {
		
		
		if(a==null)
		{
			a=new A();
		}
		return a;
	
	}
}

public class Singleton {

	public static void main(String[] args) {
		
		A a1=A.get();
		System.out.println(a1.get());
		
		
		A a2=A.get();
		System.out.println(a2);
		
		
	

	}

}
