package in.softronix;

class waiter1 extends Thread
{
	Object plate;
	Object spoon;
	
	
	public waiter1(Object plate, Object spoon) 
	{
		
		this.plate = plate;
		this.spoon = spoon;
		
	}
	
	
	public void run()
	{
		synchronized(plate)
		{
			System.out.println("Plate.waiter1  : waiting for Spoon.....");
			
				synchronized(spoon)
				{
					System.out.println("Spoon.waiter1 : Present on a table ");
				}
		}
	}
	
	
	
}

class waiter2 extends Thread
{
	Object plate;
	Object spoon;
	
	public waiter2(Object plate, Object spoon) 
	{
	
		this.plate = plate;
		this.spoon = spoon;
	}
	
	public void run()
	{
		synchronized(spoon)
		{
			System.out.println("spoon.waiter2 :waiting for plate");
			
				synchronized(plate)
				{
					System.out.println("plate.waiter2 :present on table ");
				}
		}
	}
	
}

public class DeadLock {

	public static void main(String[] args) {
		
		Object  plate=new Object();
		Object  spoon=new Object();
		
		
		waiter1 w=new waiter1(plate, spoon);
		waiter2 ww=new waiter2(spoon, plate);
		
		w.start();
		ww.start();
		
		
		
	}

}






