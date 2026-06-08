package in.softronix;

class C{
	
	public C set() {
		C c=new C();
		return c;
		
	}
	
	public C show() {
		return this;
	}
}


public class ClassObjects {

	public static void main(String[] args) {
		
		C c1=new C();
		
		System.out.println(c1);
		
		System.out.println("-------");
		
		
		System.out.println(c1.set());
		System.out.println(c1.set());
		
		System.out.println("-------");
		
		System.out.println(c1.show());	

	}

}
