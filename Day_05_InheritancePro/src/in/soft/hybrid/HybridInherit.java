package in.soft.hybrid;

class A{

	public void show() {
		
		System.out.println("I am in A");
	}	
}
class B extends A{

	public void show1() {
		
		System.out.println("I am in B");
	}	
}
class F extends A{

	public void show2() {
		
		System.out.println("I am in B");
	}	
}



class C extends A{

	public void show3() {
		
		System.out.println("I am in C");
	}	
}
class D extends B{

	public void show4() {
		
		System.out.println("in am in D");
	}	
}
class E extends F{

	public void show5() {
		
		System.out.println("i am in E");
	}	
}



public class HybridInherit {

	public static void main(String[] args) {
		
		System.out.println("========Heirarchy========= ");
		C c=new C();
		c.show3();
		c.show();
		
		
		System.out.println("=====Multilevel========");
		E e=new E();
		e.show();//A class
		e.show2();//F class
		e.show5();//E class
		
		System.out.println("========Single Level===========");
		
		B b=new B();
		b.show();//A class
		b.show1();// B class
		
		
		
		

	}

}
