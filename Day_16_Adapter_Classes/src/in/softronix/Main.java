package in.softronix;

public class Main {

	public static void main(String[] args) {
		
		
		
		Android and2=new Android();
		
		IPhone ip=new Adapter(and2);
		
		ip.iphonecharger();

	}

}
