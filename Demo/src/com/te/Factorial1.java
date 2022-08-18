package com.te;

import java.util.Scanner;

public class Factorial1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n = s.nextInt();
		System.out.println(factorial1(n));
	}

	public static int factorial1(int n) {
		int fact = 1;
		for (int i = n; i >= 2; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
