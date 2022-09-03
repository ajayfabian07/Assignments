package com.te.vowels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		//ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("Enter the input");
		int num=scanner.nextInt();
		
		String str[]=new String[num];
		
		for (int i = 0; i < str.length; i++) {
			
			System.out.println("Enter the "+i+ "String");
			str[i]=scanner.next();
		}
		
		System.out.println(UserMainCode.matchCharacter(str));
		
		
	}

}
