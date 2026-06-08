package in.softronix;

class B
{                     //[1],[2],[3],[4]
	void cal(int ...a)//10 ,20 ,30 ,40
	{                 //[0],[1],[2],[3] (This is indexing)
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Elements:"+sum);
	}
}

public class Varag_Argument_02 {

	public static void main(String[] args) 
	{
		B t=new B();
		t.cal(10,20,30,40);
		t.cal(1,23);
		t.cal(4);
	}
}
