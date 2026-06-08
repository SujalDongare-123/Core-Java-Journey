package in.softronix;
// This method is called Eager Initialization 
class C{
	
	private static C c=new C();
	
	public static C get() 
	{
		return c;
	}
}

public class Third_Way {

	public static void main(String[] args) {
		
		C c1=new C();
		System.out.println(c1.get());
		
		C c2=C.get();
		System.out.println(c2.get());

	}

}
