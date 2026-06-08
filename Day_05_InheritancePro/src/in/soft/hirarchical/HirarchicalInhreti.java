package in.soft.hirarchical;

class A {
	
	public A() {
		System.out.println("i am in A");
	}
	public void read() {
		System.out.println("read method in A class");
	}
}

class B extends A{
	
public B() {
	System.out.println(" i am in B");	
}
public  void write() {
	System.out.println("write this method in B class");
}
}

class C extends A{
	
	public C() {
		System.out.println("i am in C");
	}
	public void readTwice() {
		System.out.println("read method twice in C class");
	}
	
}

class D extends A{
	public D() {
		System.out.println("i am in D ");
	}
	public void writeTwice() {
		System.out.println("write  method twice in D class");
	}
}

public class HirarchicalInhreti {

	public static void main(String[] args) {
		
		B  b=new  B();
		b.read();
		b.write();
		
		System.out.println("============");
		C c=new C();
		c.read();
		c.readTwice();
		
		System.out.println("============");
		D d=new D();
		d.read();
		d.writeTwice();
		

	}

}
