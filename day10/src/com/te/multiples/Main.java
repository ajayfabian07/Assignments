
package com.te.multiples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
	  System.out.println("Enter the input");
	  int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
		a1.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.removeMultiplesOfThree(a1));

	}

}
