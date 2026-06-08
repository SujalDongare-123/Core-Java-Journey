package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


//1)  boolean anyMatch (Predicate p)
//2)  boolean allMatch (Predicate p)
//3)  boolean noneMatch (Predicate p)


class Person
{
	String name,city;
	int sal;
	
	public Person(String name, String city, int sal)
	{
		this.name = name;
		this.city = city;
		this.sal = sal;
	}
}


public class _09_Mactching_Operation {

	public static void main(String[] args) 
	{
		Person p1 =new Person("Sujal", "NAGPUR", 50000);
		Person p2 =new Person("Abhya", "PUNE", 40000);
		Person p3 =new Person("Daddu", "MUMBAI", 560000);
		Person p4 =new Person("Babya", "DEHLI", 56000);
		Person p5 =new Person("Umer", "HYDRABAD", 40000);
		Person p6 =new Person("Sahajahan", "PAKISTAN", 10000);
		
		List<Person> p = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		boolean anyMatch = p.stream().anyMatch(s->s.city.equals("NAGPUR"));
		System.out.println("AnyMatch Method :"+anyMatch);
		
		boolean allMatch = p.stream().allMatch(s->s.city.equals("NAGPUR"));
		System.out.println("AnyMatch Method :"+allMatch);
		
		boolean noneMatch = p.stream().noneMatch(s->s.city.equals("NAGPUR"));
		System.out.println("AnyMatch Method :"+noneMatch);
		
		
		
//		FindFirst()
		
		Optional<Person> f = p.stream().findFirst();
		if(f.isPresent())
		{
			System.out.println("Name :"+f.get().name +" City :"+f.get().city);
			
		}
		
		Optional<Person> first = p.stream().filter(v->v.city.equals("MUMBAI")).findFirst();
		
		System.out.println();	
		if(first.isPresent())
		{
			System.out.println("Name :"+first.get().name);
		}

		

	}

}
