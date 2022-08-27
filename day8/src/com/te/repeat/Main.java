package com.te.repeat;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=scanner.next();
		
		System.out.println("Enter the Value");
		int n1=scanner.nextInt();
		
		System.out.println(UserMainCode.repeatFirstThreeCharacters(s1, n1));
	}
	

	

}

