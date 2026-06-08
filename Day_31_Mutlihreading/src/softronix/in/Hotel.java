//wait = notify concept 
//you need to use the wait and notify with the synchronized
package softronix.in;

class Restaurent
{
	boolean flag=true;
	int count=0;
	
	public synchronized void  chef() 
	{
		for (int i=0;i<=10;i++)  //		while (true) 
		{
			try 
			{
				if (flag == false) 
				{
					System.out.println(" chef cooked the food "+count);
					flag=true;
					notify();
					wait();
				}
				else
				{
					wait();
				}
				
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public synchronized void  waiter() 
	{
		for (int i=0;i<=10;i++)  //		while (true) 
		{
			try 
			{
				if (flag == true) 
				{   count=count+1;
					System.out.println(" waiter take order "+count);
					flag=false;
					notify();
					wait();
				}
				else
				{
					wait();
				}
				
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

// chef class
class Restaurent_Chef  extends Thread
{
	Restaurent r;

	public Restaurent_Chef(Restaurent r) 
	{
		this.r = r;
	}
	
	public void run()
	{
		r.chef();
		
	}
}

// waiter  class
class Restaurent_Waiter extends Thread
{
	Restaurent r;

	public Restaurent_Waiter(Restaurent r) 
	{
		this.r = r;
	}
	
	public void run()
	{
		r.waiter();
		
	}
}


public class Hotel {

	public static void main(String[] args)
	{
		Restaurent r=new Restaurent();
		
		Restaurent_Chef c=new Restaurent_Chef(r);
		Restaurent_Waiter w=new Restaurent_Waiter(r);
		
		c.start();
		w.start();

	}

}
