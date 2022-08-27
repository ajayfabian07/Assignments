package com.te.repeat;

public class UserMainCode {

	public static String repeatFirstThreeCharacters(String s1, int n1) {
		
		String res = "";
		
		
		if (s1.length() < 3) { //So 
			for (int i = 0; i < n1; i++) { //2
				res = res + s1; //sososo
			}

		} else {
			
			for (int i = 0; i < n1; i++) { //catcowcat
				String sub = s1.substring(0, 3); //cat
				res = res + sub; //catcatcat
			}
		}

		return res;
	}
}
