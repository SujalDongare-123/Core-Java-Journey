package in.soft.apis;

import java.util.Base64;

public class _18_IOStream_Base64 {

	public static void main(String[] args)
	{
		String original="Hello";
		
		
		String encodeToString = Base64.getEncoder().encodeToString(original.getBytes());
		System.out.println(encodeToString);
		
		
		
		byte[] decode = Base64.getDecoder().decode(encodeToString);
		String decoding=new String(decode);
		System.out.println(decoding);
		
		
	}

}
