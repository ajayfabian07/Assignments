package com.te;

import java.util.Scanner;

public class VariablesAndMethods {
	public static void main(String[] args) {
		System.out.println("Welcome to Techno Elevate");
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter input");
//		int input1 = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println(input1);
//		System.out.println("Enter Name:");
//		String name = scanner.nextLine();
//		System.out.println("Name is "+name);
		System.out.println("Enter input values");
		int size=scanner.nextInt();
		for(int i=0;i<size;i++) {
			scanner.nextInt();
		}
		System.out.println("Size Exceeded");
	}

}
