package in.softronix.UserDefine;


class Phone
{
	void android()
	{
		System.out.println("Android user:: Phone");
	}
	
}

class IPhone extends Phone
{
	void macOs()
	{
		System.out.println("Mac users :: IPhone");
	}
}

public class UserDefineTypeCasting {

	public static void main(String[] args) {
		
		
		//upcasting 
		
//		you  have to create the reference variable of  super class and object of sub class.
		Phone p=new IPhone();
		p.android();
		
		
		//DownCasting 
		
//
//		IPhone ip =(IPhone) p;
//		ip.android();
//		ip.macOs();
	
		
		
		// There is rule that the Downcasting is happen only if the UPncasting is done 
		
		if(p instanceof Phone)   // This is instanceof (we check that if upcating is done or not )
		{
			
			IPhone ip =(IPhone) p;
			ip.android();
			ip.macOs();
			
		}
		

		
		
		

	}

}
