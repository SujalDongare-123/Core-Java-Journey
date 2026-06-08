package in.softronix;



class A
{                     
	void cal(int a,int b)//paramatersised method
	{                 
		System.out.println(a+b);
	}
	void cal(int a,int b,int c)//paramaterised method 
	{
		System.out.println(a+b+c);
	}
	void cal(int a)//paramaterised method 
	{
		System.out.println(a*a);
	}

////same name of method with different parameters is called method Overloading .
////we have to pass more argument to do that task thats there is concept is Varag Argument 
//
}



public class Varag_Argument 
{
public static void main(String[] args) 
{
	A t=new A();
	t.cal(10,20,30);
	t.cal(1,23);
	t.cal(2);
	
}
}