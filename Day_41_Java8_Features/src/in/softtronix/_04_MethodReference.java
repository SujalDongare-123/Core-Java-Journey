package in.softtronix;

import java.util.function.Consumer;


public class _04_MethodReference {
	
	public void m(String msg)
	{
		System.out.println(msg);
	}

	public static void main(String[] args)
	{
		 {
			 _04_MethodReference d=new _04_MethodReference();
		
		
		Consumer<String> c= d :: m;
		c.accept("hello ");

	}

	}
}
