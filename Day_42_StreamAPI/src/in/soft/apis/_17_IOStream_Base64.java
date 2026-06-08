package in.soft.apis;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class _17_IOStream_Base64 
{

	public static void main(String[] args)
	{
		
		System.out.println("***************Encoding ****************************");
		
		String str="Sujal";
		
		Encoder en = Base64.getEncoder();
		
		//Converting String to byte[]
		byte[] e = en.encode(str.getBytes());
		
		
		//Converting byte[] to String 
		String encode=new String(e);
		
		System.out.println(encode);
		
		
		
		System.out.println("*******************Decoding **************************");
		
		
		Decoder decoder = Base64.getDecoder();
		
		//Converting String to byte[]
		byte[] decode = decoder.decode(encode);
		
		//Converting byte[] to String 
		String decoding =new String(decode);
		
		System.out.println(decoding);
	
	}

}
