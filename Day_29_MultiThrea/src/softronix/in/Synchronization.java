package softronix.in;

class WishT
{
	public void wish(String name)
	{
		
		//try-catch
		
		try {
			Thread.sleep(7000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
//		for loop 
		for (int i = 0; i < 10; i++)
		{
			System.out.println("whishing you "+Thread.currentThread().getName());
		}
	}
}

 class Hello extends Thread       
{
	 WishT wish;
	 public Hello(WishT wish)
	 {
		 this.wish=wish;
	 }
	 
	 public void run()
	 {
		 System.out.println(wish);
		 wish.wish("siya");
	 }
}
 
 class Hi extends Thread
{
	 WishT wish;
	 
	 Hi(WishT wish)
	 {
		 this.wish=wish;
	 }
	 
	 public void run()
	 {
		 System.out.println(wish);
		 wish.wish("riya");
	 }
}
 
 class Welcome extends Thread
{
	 WishT wish;
	 
	 Welcome(WishT wish)
	 {
		 this.wish=wish;
	 }
	 
	 public void run()
	 {
		 System.out.println(wish);
		 wish.wish("piya");
	 }
}

public class Synchronization {

	public static void main(String[] args)
	{
		
		WishT wish=new WishT();
		
		Hello hello =new Hello(wish);
		Hi  hi=new Hi(wish);
		Welcome wel =new Welcome(wish);
		
		hello.setName("hello");
		hi.setName("hi..");
		wel.setName("welcome");
		
		hello.start();
		hi.start();
		wel.start();

	}

}
