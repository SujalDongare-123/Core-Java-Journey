package in.softronix;

class B{
	
	
	
	public B(String name) {
		System.out.println("i am in String para constructor ");
	}
	
	
	public B(int i) {
		this("Sujal");
		System.out.println("i am in int para constructor ");
	}
	
	
	public B() {
		this(10);
		System.out.println("i am in default constructor ");
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		B b=new B();
	

	}

}
