package com.te.sumofodd;

import java.util.Scanner;

public class UserOddCode {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
				
		System.out.println("Enter the Number");// 1234
		int input1 = scanner.nextInt();
		int result = SumOfOdd.sum(input1);
		System.out.println(result);
		if (result == 1) {
			System.out.println("Odd Number");}
		else
			System.out.println("Even Number");
	}
}