package in.soft.LambaExpression;

@FunctionalInterface
interface  Even
{
	public String even(int no);
}

public class _04_java8_lambdaExpresion_AddOperation {

	public static void main(String[] args) 
	{
	
		Even e= no -> (no % 2 == 0  ) ?  "This is even " : "This is odd" ;
		
		System.out.println(e.even(56));
		
		
		Even e1= no -> (no >0 ) ?  "The Number is Positive  " : "The number is negative " ;
		System.out.println(e1.even(6));
		System.out.println(e1.even(-6));
		
		
	}

}




