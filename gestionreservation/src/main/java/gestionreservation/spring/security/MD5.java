package gestionreservation.spring.security;

import java.security.*;
import java.math.*;

public class MD5 {
	public static void main(String args[]) throws Exception {
		String s = "1111";
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(s.getBytes(), 0, s.length());
		System.out.println("MD5: " + new BigInteger(1, m.digest()).toString(16));
	}

	public static String tomd5(String s) throws Exception {
		try{
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(s.getBytes(), 0, s.length());
			String f = new BigInteger(1, m.digest()).toString(16);
		return f;
		}catch(Exception e)
		{
			return "";
		}
	}
	// ce114e4501d2f4e2dcea3e17b546f339
	// ce114e4501d2f4e2dcea3e17b546f339
	// 1b0755ef48f328f59a422e35af61ea96
	// b59c67bf196a4758191e42f76670ceba
}