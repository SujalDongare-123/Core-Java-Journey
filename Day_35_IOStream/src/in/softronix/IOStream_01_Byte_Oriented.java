package in.softronix;

//NOTE: All the ByteOrientedStream classes are terminated with "Stream" word.

import java.io.FileOutputStream;

public class IOStream_01_Byte_Oriented {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("D:/IOS_file/Stream.txt");
		
		String s="ABCD";
	
		
		byte[] b=s.getBytes(); // convert array string to byte 
	
		
		for (byte c : b) // use to get the byte 
		{
			System.out.println(c);
		}
		
		fos.write(b); // write used for output 
		fos.close();
	}

}
