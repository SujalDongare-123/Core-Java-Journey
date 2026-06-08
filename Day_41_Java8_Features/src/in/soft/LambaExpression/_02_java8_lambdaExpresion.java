package in.soft.LambaExpression;

@FunctionalInterface
interface Demo1
{
	public void m1();

}

public class _02_java8_lambdaExpresion 
{
	
	public static void main(String arg[])
	
	{
		
    Demo1 d=()->{System.out.println("Use the Lambda Expression ");};
    d.m1();
    
    }
}