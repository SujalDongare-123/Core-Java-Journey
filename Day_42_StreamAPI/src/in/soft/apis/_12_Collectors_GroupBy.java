package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp
{

	int eid;
	String ename;
	int esal;
	String city;
	String country ;
	
	public Emp(int eid, String ename, int esal, String city, String country) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", city=" + city + ", country=" + country
				+ "]";
	}
}

public class _12_Collectors_GroupBy {

	public static void main(String[] args) 
	{
		Emp e1=new Emp(101, "Sujal", 50000, "Nagpur", "India");
		Emp e2=new Emp(102, "Abhi", 50000, "Mumbai", "India");
		Emp e3=new Emp(103, "Daddu", 50000, "Nagpur", "Dubai");
		Emp e4=new Emp(104, "Babya", 50000, "Pune", "Thailand");
		Emp e5=new Emp(105, "Prathamesh", 50000, "Hydrabad", "Indoneshia");
		Emp e6=new Emp(106, "Shreyash", 50000, "Gujrat", "Pakistan");
		Emp e7=new Emp(107, "Ritika", 50000, "Amravati", "India");
		
		List<Emp> list=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		Map<String, List<Emp>> collect = list.stream().collect(Collectors.groupingBy(e->e.country));  // Using the method reference Emp::getCountry
		
		System.out.println(collect);

	}

}
