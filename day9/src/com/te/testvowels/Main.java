package com.te.testvowels;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.next();
		System.out.println(UserMainCode.testVowels(str));
		scanner.close();
	}

}

