package in.soft.multilevel;

class Student {
	
	public void test() {
		
		System.out.println("---Test done by Studemt--- ");
	}
}


class Teacher extends Student{
	
	public void result() {
		
		System.out.println("---result declared---");
	}
}


class Principle extends Teacher{
	
	public void performance() {
		
		System.out.println("---Show performance---"); 
	}
}


public class Multilevel {

	public static void main(String[] args) {
		
		System.out.println("SINGLE LEVEL");
		
		Teacher t=new Teacher();
		t.test();
		t.result();
		
		System.out.println("MULTILEVEL");
		
		Principle p=new Principle();
		p.test();
		p.result();
		p.performance();
		
		

	}

}
