package com.te.occurances;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st String");
		String s1 = scanner.next();

		System.out.println("Enter the 2nd String");
		String s2 = scanner.next();

		System.out.println(UserMainCode.getSubstring(s1, s2));

	}

}
