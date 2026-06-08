package in.softronix;

class A{
	
	static int id=10;
	int age;
	String name;
	
	
   	void show(int age,String name)
   {
	   this.age=age;
	   this.name=name;
   }
   	
}

public class Static_Variable {

	public static void main(String[] args) {
		
		
		
		A a=new A();
		A a1=new A();
		A a2=new A();
		A a3=new A();
		
		a.show(20,"sujal");
		a1.show(30, "sejal");
		a2.show(0, "vejal");
		a3.show(40, "bhujal");
		
		
		//System.out.println(A.id);
		
		
		System.out.println("========Difference between Static and Instance=========== ");
		
		System.out.println(a.id++  +"  "+ a.age++ );
		System.out.println(a1.id++  +"  "+ a1.age++ );
		System.out.println(a2.id++  +"  "+ a2.age++ );
		System.out.println(a3.id++  +"  "+ a3.age++ );
		
		
		

	}

}
