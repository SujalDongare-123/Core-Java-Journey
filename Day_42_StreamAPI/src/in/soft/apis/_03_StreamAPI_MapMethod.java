package in.soft.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _03_StreamAPI_MapMethod {

	public static void main(String[] args)
	{
		List<String> List = Arrays.asList("Nagpur","Pune", "Mumbai", "Dehli" , "Hydrabad", "Amravati");
		System.out.println(List);
		//This is first way to create map but lengthy
		
		Stream<String>  stream = List.stream();
		stream.map(cityName->cityName.toLowerCase()).forEach(cityName->System.out.println(cityName));
		
		//This is 2nd way and short . choose as your understanding 
		System.out.println("*************************************************************");
		List.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));		//map modifeid  karata existed data ko ..... filter condition lagane ke liye karte
		
		
		System.out.println("***********************************************************");
		List.stream().filter(s->s.startsWith("N")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
		
		System.out.println("*******************************************************");
		List.stream().mapToInt(r->r.length()).forEach(r->System.out.println(r));
		


		
		
	}

}
