package com.te.boundary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		int array[]=new int[size];
				for (int i = 0; i < array.length; i++) {
					array[i]=scanner.nextInt();
				}
				float result=Boundary.boun(array);
		System.out.println(result);
		
	}

}
