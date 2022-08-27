package com.te.characters;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s2=scanner.nextLine();
		
		int result=Character.cha(s2);
		if(result==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
		
//		if(Character.cha(s2)==1); {
//		System.out.println("Valid");
//		}
//		else { 
//			System.out.println("Invalid");
//		}
//	}
//
//}
