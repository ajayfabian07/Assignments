package com.te.sumofodd;

public class SumOfOdd {
	public static int sum(int input1) {
		int sum = 0;
		int digit = 0;
		while (input1 > 0) {
			digit = input1 % 10;
			if (digit % 2 != 0) {
				sum = sum + digit;
			}
			input1 = input1 / 10;

		}
		if (sum % 2 == 1)
			return 1;
		else
			return -1;
	}
}