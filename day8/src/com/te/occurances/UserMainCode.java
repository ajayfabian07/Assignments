package com.te.occurances;

public class UserMainCode {
	public static int getSubstring(String s1,String s2)
	{
		int count=0;
		int len=s2.length();
		for (int i = 0; i < s1.length()-2; i++) { //cowcatcow
			String temp=s1.substring(i, i+len);
			if(temp.equals(s2))
				count++;
		}
		return count;
		

	}

}
