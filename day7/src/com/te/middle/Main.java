package com.te.middle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scanner.next();
		//String result=Middle.mid(s1);
		if(s1.length()%2!=0)
			System.out.println("Enter Even digit");
		else
		System.out.println(Middle.mid(s1));
	}
}
	


