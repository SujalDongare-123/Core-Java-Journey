package in.softronix.marker;

interface AdminAccess
{
	//Marker Interface 
}

//Noraml user 

class NormalUser
{
	 String name;
	 
	public NormalUser(String name) {
		this.name=name;	
	} 
	
	public String getName() 
	{
		return name;
	}
}
//Admin user 

class AdminUser extends NormalUser implements AdminAccess
{
	public AdminUser(String name)
	{
		super(name);
	}	
}

 //Access Services 
 class AccessService
 {
	 public static void checkAccess(NormalUser user) 
	 {
		 if(user instanceof AdminAccess)
		 {
			 System.out.println("Admin access granted :"+user.getName());
		 }
		 else
		 {
			 System.out.println("Access denied: "+user.getName());
		 }
	 }
 }

public class Main {

	public static void main(String[] args)
	{
		
		AdminUser admin=new AdminUser("Sujal");
		NormalUser Normaluser=new NormalUser("Rahul");
		
		
		AccessService.checkAccess(Normaluser);
		AccessService.checkAccess(admin);
	}

}
