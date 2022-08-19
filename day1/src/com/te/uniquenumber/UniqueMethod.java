package com.te.uniquenumber;

public class UniqueMethod {
	public static int unique(int num) {
		int count = 0;
		int digit = 0;
		int digit2 = 0;

		while (num > 0) {
			digit = num % 10;
			while (num > 0) {
				digit2 = num % 10;
				if (digit == digit2)
					count++;
				num = num / 10;
			}
			num = num / 10;
		}
		if (count >= 2)
			return -1;
		else
			return 1;

	}
}