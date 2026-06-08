package in.softronix;

 



class Emp extends Thread{
	
	   
	public void run() {
		
		System.out.println(" start thread "+Thread.currentThread().getName());
		
		for(int i = 0;i<10;i++) {
			
			
			System.out.println(Thread.currentThread().getName());
			
		}
		System.out.println("end thread "+Thread.currentThread().getName());
		
		
	}
	
}

public class Multithread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Emp e = new Emp();
		
		
		Thread t1=new Thread(e);
		Thread t2=new Thread(e);
		Thread t3=new Thread(e);
		Thread t4=new Thread(e);
		
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3");
		t4.setName("thread4");
		

		
		t1.setPriority(Thread.MAX_PRIORITY);
		
//		t2.setPriority(Thread.NORM_PRIORITY);
		
//		t3.setPriority(Thread.MIN_PRIORITY);
		
		t4.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("thread is before---"+t1.isAlive());
		System.out.println(Thread.activeCount());
		
		

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		System.out.println(Thread.activeCount());
		System.out.println("thread is After---"+t1.isAlive());
		
	}

}
