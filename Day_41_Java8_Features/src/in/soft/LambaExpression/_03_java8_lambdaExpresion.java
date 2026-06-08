package in.soft.LambaExpression;

@FunctionalInterface
interface Demo2
{
	public void m1();
	
	
	default void check()
	{
		
		System.out.println("This is default method in functional interface ");
	}
	
	
	
	static void s()
	{
		
		System.out.println("This static method in functional interface ");
		
	}

}

public class _03_java8_lambdaExpresion 
{
	
	public static void main(String arg[])
	
	{
		
    Demo2 d=()->{System.out.println("Use the Lambda Expression ");};
    d.m1();
    
    d.check();
    
    Demo2.s();
    
    
    
    
    }
}