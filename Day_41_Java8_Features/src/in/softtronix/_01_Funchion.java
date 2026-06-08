package in.softtronix;

import java.util.function.Function;  


interface Fun
{
	public abstract void funTest();
}
class Fun2 implements Fun
{
	@Override
	public void funTest()
	{
		System.out.println("This is implemented method ");
	}
}

public class _01_Funchion {

	public static void main(String[] args)
	{
		Fun2 f=new Fun2();
		f.funTest();
		
		
		// Function 
		Function<String, Integer> fu=(name)->{return name.length();};  //Fuction is use to take input and return the ouput according to your need as String and integer 
		System.out.println(fu.apply("Softronix"));
	}

}
