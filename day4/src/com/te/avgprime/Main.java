package com.te.avgprime;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Element");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		double result = Prime.pri(array);
		System.out.println(result);
	}

}
