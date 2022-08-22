package com.te.evensum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int result=Method.even(array);
		System.out.println(result);
	}

}

	