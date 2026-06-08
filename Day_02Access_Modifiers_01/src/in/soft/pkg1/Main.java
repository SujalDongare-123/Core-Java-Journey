package in.soft.pkg1;

import in.soft.pkg2.D;
import in.soft.pkg2.E;

public class Main {

	public static void main(String[] args) {
		
		A a=new A();
		a.show();
		
		
		System.out.println("==========");
		
		B b=new B();
		b.showdata();
		System.out.println("==========");
		C c=new C();
		c.getdata();
		System.out.println("==========");
		
		D d=new D();
		d.getdata();
		System.out.println("==========");
		
		E e=new E();
		e.getdata();
		
		

	}

}
