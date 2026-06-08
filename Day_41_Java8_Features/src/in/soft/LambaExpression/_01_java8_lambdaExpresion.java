package in.soft.LambaExpression;

interface  Demo
{
	public void m1();
}

class Test implements Demo
{

	@Override
	public void m1() 
	{
		System.out.println("Without Fuctional Interface ");
		
	}
	

}

class _01_java8_lambdaExpresion {

	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();
		
		Demo d=new Test();
		d.m1();
		
	}

}
