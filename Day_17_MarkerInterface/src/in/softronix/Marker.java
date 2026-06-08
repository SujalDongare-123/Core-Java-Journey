package in.softronix;

interface PremiumUser
{
	//marker Interface 
	
}

class User
{
   String name;

   public User(String name) {
	this.name = name;
   }
   
   public String getname() 
   {
	   return name;
   }	
}

class PremiumCustomer extends User implements PremiumUser
{

	public PremiumCustomer(String name) {
		super(name);
	}
	
}

class AccessManager
{
	public static void grandPermission(User user) 
	{
		if(user instanceof PremiumUser)
		{
			System.out.println("Permission to grandAccess"+user.getname());
		}
		else
		{
			System.out.println("No, Permission to grandAccess"+user.getname());
		}
	}
}

public class Marker
{

	public static void main(String[] args) 
	{
	
		User localUser =new User("Jordan");
		PremiumCustomer premiumUser =new PremiumCustomer("jockey");
		
		AccessManager.grandPermission(localUser);
		AccessManager.grandPermission(premiumUser);
	}

}
