package in.soft.staticpoly;

class Person{
	public void graduate() {
		System.out.println("this person graduate with 95%");
	}
	public void graduate(int marks ) {
		System.out.println("This person graduate with "+marks+"%");
	}
	public void graduate(float marks ) {
		System.out.println("This person is geradutate with "+marks+"%");
	}
}

public class Overloading {

	public static void main(String[] args) {
	
		Person p=new Person();
		p.graduate();
		p.graduate(90);
		p.graduate(89.8f);
	
	}

}
