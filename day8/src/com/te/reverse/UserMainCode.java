package com.te.reverse;

public class UserMainCode {
	public static String reshape(String s1) {
		String s2=""; 
		for (int i = s1.length()-1; i >=0; i--) {
			s2=s2+s1.charAt(i) + "-";  
		}
	return s2;
	}

}
