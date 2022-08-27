package com.te.forming;

public class Forming {
	public static String formNewWord(int n1,String s1) {
		String s2=s1.substring(0, n1);  //it will reach from 0,3 which will read from (0-2)
		System.out.println(s2); //cal // for 2 values 0,1 it will consider index value
		String s3=s1.substring(s1.length()-n1);//it will reach from 10-3 = 7 which will read from 7,8,9 last everything
		System.out.println(s3); //nia  // for 1 value from length itwill be added till last
		StringBuffer s4=new StringBuffer();
		s4=s4.append(s2).append(s3);
		String s5=s4.toString();
		return s5;
	}
	}
