package in.softronix;

abstract class A implements Interface 
{
	public A() {
		System.out.println("i am Construcotr");
	}
	
	abstract void testAbs();
	
	@Override
	public void student()
	{
		System.out.println("i am in Student ");	
	}
		
	
}

class C extends A{

	

	

	@Override
	void testAbs() {
		System.out.println("i am in test method");
		
	}



	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractPro {

	public static void main(String[] args)
	{
		C b=new C();
		b.student();
		b.teacher();

	}

}
