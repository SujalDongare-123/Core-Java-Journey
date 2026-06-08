package in.softtronix;

interface MyInterface
{
	public abstract void demo();
}
class MethodRef
{
	public static void test()
	{
		System.out.println("hello i am in test method ");
	}
}

public class _03_MethodReference {

	public static void main(String[] args) 
	{
		MyInterface mi=MethodRef:: test;
		mi.demo();

	}

}
