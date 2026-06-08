package in.softronix;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int a=100;
		
		 
		try {
			
		int	b=a/0;
			
		} catch (Exception e) {
			 
			e.printStackTrace();	
		}
		finally {
			System.out.println(" any how run ");
		}
	}

}
