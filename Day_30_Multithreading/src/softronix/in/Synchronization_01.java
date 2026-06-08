package softronix.in;

class WishT {
	
	
	public synchronized void wish(String name) {
	
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	for(int i=0;i<10;i++) {
		
		System.out.println("wishing you "+Thread.currentThread().getName()+name);
	}
	}
	
}

class Hello extends Thread {
	
	WishT wish;	
	
	public Hello(WishT wish) {
		this.wish = wish;
	}
	public void run() {
		
		System.out.println(wish);
		
		wish.wish("siya");
		
	}
	
	
}

class Hi extends Thread{
	
WishT wish;	
	
	public Hi(WishT wish) {
		this.wish = wish;
	}
	
public void run() {
	
	System.out.println(wish);
	wish.wish("riya");
	
		
	}
}

class Welcome extends Thread{
	
WishT wish;	
	
	public Welcome(WishT wish) {
		this.wish = wish;
	}
	
public void run() {
	System.out.println(wish);
	wish.wish("viya");
	
		
	}
}

public class Synchronization_01 {

	public static void main(String[] args) {
		
		WishT wish = new WishT();
		
		Hello hello = new Hello(wish);
		Hi hi = new Hi(wish);
		Welcome wel = new Welcome(wish);
		
		hello.setName("hello....");
		hi.setName("hi....");
		wel.setName("welcome....");
		
		hello.start();
		hi.start();
		wel.start();
		
		
	}

}