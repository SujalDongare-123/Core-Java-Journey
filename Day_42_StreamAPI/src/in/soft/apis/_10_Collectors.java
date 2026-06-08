package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student 
{
 
	int rollNo;
	String name, clg , city;
	
	
	public Student(int rollNo, String name, String clg, String city) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.clg = clg;
		this.city = city;
	}


	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", clg=" + clg + ", city=" + city + "]";
	}
	
	
}

public class _10_Collectors {

	public static void main(String[] args) 
	{
		Student s1=new Student(101, "Sujal", "PBCOE", "Nagpur");
		Student s2=new Student(101, "Ritika", "PCE", "Nagpur");
		Student s3=new Student(101, "Pratik", "KDK", "Nagpur");
		Student s4=new Student(101, "Sahil", "YCCE", "Nagpur");
		Student s5=new Student(101, "Deepanshu", "YCCE", "Nagpur");
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
		
		List<Student> collect = list.stream().filter(s->s.clg.equals("YCCE")).collect(Collectors.toList());
		collect.forEach(i->System.out.println(i));
		//collect.forEach(System.out :: println);
		
		System.out.println("************************************************************************");
		
		List<Student> co = list.stream().filter(s->s.name.startsWith("S")).collect(Collectors.toList());
		co.forEach(i->System.out.println(i));
		
		
		
		
		
		
		
	}

}
