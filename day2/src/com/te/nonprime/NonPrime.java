package com.te.nonprime;

public class NonPrime {
	public static int abc(int num) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}

			if (count != 2)
				sum = sum + i;
		}
		return sum;

	}

}
