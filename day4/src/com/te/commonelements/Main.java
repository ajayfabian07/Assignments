package com.te.commonelements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < a.length; i++) {

			a[i] = scanner.nextInt();
		}
		int[] b = new int[size];
		System.out.println("Enter the Array Elements");
		for (int j = 0; j < b.length; j++) {
			b[j] = scanner.nextInt();
		}
		int result = CommonElements.elements(a, b);
		System.out.println(result);
	}
}