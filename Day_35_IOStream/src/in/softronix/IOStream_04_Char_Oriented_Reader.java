package in.softronix;


import java.io.FileReader;

public class IOStream_04_Char_Oriented_Reader {

	public static void main(String[] args) throws Exception 
	{
		FileReader fr=new FileReader("D:/IOS_file/Soft.txt");
		
		//Solution
		String data="";
		
		int i = fr.read();
		
		while(i!=-1)
		{
			char c=(char)i;
			System.out.println(i+"="+c);
			
			data=data+c;
			i=fr.read(); // ek bar jo data liya usko dubara nhi leta isliye voh S se fr change hoga o me fr l me then u me toh voh pura denga  Solution 
		}
		
		System.out.println(data);
		

	}

}
