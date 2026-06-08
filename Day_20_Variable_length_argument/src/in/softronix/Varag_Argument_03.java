package in.softronix;

class C
{                     //[1],[2],[3],[4]
	void cal(int ...a)//10 ,20 ,30 ,40
	{                 //[0],[1],[2],[3] (This is indexing)
		int sum=0;
		for(int i=0;i<a.length;i++)
		{ 
			sum=a[(int) i];
		}
		System.out.println("Sum of Elements:"+sum);
	}
}

public class Varag_Argument_03 {

	public static void main(String[] args) 
	{
		C t=new C();
		t.cal(10,20,30,40);
		t.cal(1,23);
		t.cal(4);
	}
}
