package com.te.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		System.out.println("Enter the Array Elements");

		
		for (int i = 0; i < 5; i++)
			a1.add(scanner.nextInt());

		for (int j = 0; j < 5; j++)
			a2.add(scanner.nextInt());

		ans = UserMainCode.answer(a1, a2);
         System.out.println(ans);
         
         //System.out.println(UserMainCode.answer(a1, a2));

		for (int k = 0; k < 3; k++)
			System.out.println(ans.get(k));
		scanner.close();
	}
}
