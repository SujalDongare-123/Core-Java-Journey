package in.soft.dynamicpoly;

class Student1{
	
	public void test() {
		System.out.println("test done by student calss 1 ");
	}
	public void result() {
		System.out.println("result pass from student1 class");
	}
	
}

class Student2 extends Student1{
	public void test() {
		System.out.println("Test done by student class 2 ");
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		
		Student2 s=new Student2();
		s.test();
		s.result();
		
		
		
	

	}

}
