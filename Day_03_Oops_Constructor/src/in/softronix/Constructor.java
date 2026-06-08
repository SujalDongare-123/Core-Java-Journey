package in.softronix;

/*  constructor is same name as a class name  which use to intialize a variable at the time 
of object creation which doesn`t have any return type . */


class A
{
	
	//default Constructor 
	public A() 
	{
		System.out.println("===Default Constructor===");
	}
	
	//parametarised Constructor 
	public A(int i,int j) 
	{
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("===Parametarised Constructor===");
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		
		A a=new A();
		A a1=new A(5,10);
		
		

	}

}
