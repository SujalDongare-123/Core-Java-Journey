package in.soft.apis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Stud
{
 
	int rollNo , marks;
	String name, clg , city;
	
	
	public Stud(int rollNo, String name, String clg, String city , int marks) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.clg = clg;
		this.city = city;
		this.marks=marks;
	}


	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + ", clg=" + clg + ", city=" + city
				+ "]";
	}


	
	
	
}

public class _11_Collectors {

	public static void main(String[] args) 
	{
		Stud s1=new Stud(101, "Sujal", "PBCOE", "Nagpur" , 56);
		Stud s2=new Stud(101, "Ritika", "PCE", "Nagpur", 78);
		Stud s3=new Stud(101, "Pratik", "KDK", "Nagpur",65);
		Stud s4=new Stud(101, "Sahil", "YCCE", "Nagpur", 90);
		Stud s5=new Stud(101, "Deepanshu", "YCCE", "Nagpur", 24);
		
		List<Stud> list = Arrays.asList(s1,s2,s3,s4,s5);
		
	Optional<Stud> collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(e ->e.marks)));
	
		System.out.println(collect.get().marks);
		
		
		
		
	}

}
